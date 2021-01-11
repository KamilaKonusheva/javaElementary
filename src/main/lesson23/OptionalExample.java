package lesson23;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalExample {

    public Optional<String> emailCheck(String email) {
        String mailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*" +
                "@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern compile = Pattern.compile(mailRegex);
        Matcher mailMatcher = compile.matcher(email);
        boolean valid = email.matches(mailRegex);
        if (valid == false) {
            return Optional.empty();
        }
        return Optional.of(email);
    }
}