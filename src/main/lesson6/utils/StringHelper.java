package lesson6.utils;

import lesson6.exceptions.StringFormatException;

public class StringHelper {


    public String stringChange(String string, char[] chars) throws StringFormatException {
        if (chars == null) {
            new NullPointerException("Your char Array is empty!");
        }
        String newString = String.valueOf(chars);
        if (string.isBlank() || newString.isBlank()) {
            throw new StringFormatException();
        }
        String changedString = string.toUpperCase().trim();
        String changedString1 = newString.toLowerCase().trim();
        String finalString = changedString.concat(" " + changedString1);
        int length = finalString.length();
        int middleIndex = (length / 2) - 1;
        int middleIndex1 = (length / 2);
        if (length % 2 == 0) {
            char middle = finalString.charAt(middleIndex);
            char middle1 = finalString.charAt(middleIndex1);
            String middleChar = String.valueOf(middle) + String.valueOf(middle1);
            System.out.println(middleChar);
            return middleChar;
        } else {
            char middle2 = finalString.charAt(middleIndex1);
            String middleChar1 = String.valueOf(middle2);
            System.out.println(middleChar1);
            return middleChar1;
        }
    }
}
