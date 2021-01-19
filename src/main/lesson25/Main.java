package lesson25;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1 Пустой stream
        List<String> list = new ArrayList<>();
        Stream.empty()
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        //2 stream с Листом данных
        List<String> myList = Arrays.asList("one", "two", "three", "four");
        Stream<List<String>> myListStream = Stream.of(myList);
        myListStream = myListStream.skip(2).sorted();
        myListStream.collect(Collectors.toList());

        //3 stream с набором данных
        Stream.of("five", "six", "seven").collect(Collectors.toList());

        //4 Map
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Kamila");
        myMap.put(2, "Alex");
        myMap.put(3, "Lena");
        myMap.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getKey(), entry.getValue()))
                .map(Map.Entry::getValue).collect(Collectors.toList());

        //5
        List<String> myList1 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        Stream<String> myStream = myList1.stream();
        Set<Integer> collect = myStream.skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        //6
        Stream.of("one", "two", "three").parallel()
                .sorted()
                .filter(str -> str.length() == 3)
                .findFirst();

        //7 Ccылочные методы
        Human human = Human.create(Human::new); // ссылка на конструктор
        List<Human> humans = Arrays.asList(human);
        Stream<String> humanStream = humans.stream().map(Human::getName)   // ссылка на не статический метод
                .map(String::strip); // ссылка на статический метод
        humans.forEach(System.out::println); // ссылка к конкретному экземпляру
    }
}
