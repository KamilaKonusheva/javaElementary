package lesson6.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.print.attribute.standard.MediaSizeName.A;

public class InfoCheckHelper {

    public boolean phoneCheck(String stringPhone) {
        String phoneRegex = "^((380)|(\\+38)|(0))([0-9]{9})$";
        Pattern compile = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = compile.matcher(stringPhone);
        boolean valid = stringPhone.matches(phoneRegex);
        System.out.println(valid);
        return false;
    }

    public boolean mailCheck(String stringMail) {
        String mailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*" +
                "@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern compile = Pattern.compile(mailRegex);
        Matcher mailMatcher = compile.matcher(stringMail);
        boolean valid = stringMail.matches(mailRegex);
        System.out.println(valid);
        return false;
    }

    public boolean birthDateCheck(String stringData) {
        String dataRegex = "^[0-9]{2}[.][0-9]{2}[.][0-9]{4}$";
        Pattern compile = Pattern.compile(dataRegex);
        Matcher dataMatcher = compile.matcher(stringData);
        boolean valid = stringData.matches(dataRegex);
        System.out.println(valid);
        return false;
    }
}
