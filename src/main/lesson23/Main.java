package lesson23;


import lesson20.entities.Client;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Women women = new Women();
        women.swimming();
        women.workingHours(8);
        women.walk(25);
        women.relaxationAdvice();
        Relax.relax();
        Man man = new Man();
        man.walk();
        man.freeTime();
        Hobby.hobby("photographing");
        man.someInformation("It's very interesting for me");
        man.timeForHobby(2);

        OptionalExample example = new OptionalExample();
        System.out.println(example.emailCheck("kamila@mail.ru"));
        System.out.println(example.emailCheck("kamila"));

        // Functional Interface

        Predicate<Double> salary = aDouble -> aDouble > 1500;
        System.out.println(salary.test(1600.7));
        System.out.println(salary.test(1200.5));

        Consumer<String> printer = string -> {
            char[] result = string.toCharArray();
            for (int i = 0; i < result.length; i++) {
                System.out.println("Element [" + i + "]: " + result[i]);
            }
        };
        printer.accept("hello");

        Function<Integer, String> numbers = (value) -> {
            if (value == 0 || value > 10) {
                //System.out.println("unknown");
                return "unknown";
            }
            switch (value) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                case 10:
                    return "ten";
            }
            return value.toString();
        };

        //numbers.apply(1);
        //numbers.apply(10);
        //numbers.apply(5);
        //numbers.apply(19);

        Supplier<Client> supplier = () -> {
            Client client = new Client();
            client.setEmail("kamila@mail.ru");
            return client;
        };
        Client client = supplier.get();
        System.out.println(client.toString());
    }
}
