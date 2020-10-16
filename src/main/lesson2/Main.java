package lesson2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        InitializationData data = new InitializationData();
        Information information = data.dataWriter();
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        mailCheck(number, information);
        System.out.println(information);

    }

    private static Information mailCheck(List<? extends Number> list, Information information) {
        List<String> newList = new ArrayList<String>(list.size());
        Iterator<Integer> itr = (Iterator<Integer>) list.iterator();
        while (itr.hasNext()) {
            newList.add(itr.next().toString());
            itr.remove();
        }
        if (!newList.contains("@mail.ua")) {
            newList.add("@mail.ua");
        }
        return information;
    }
}
