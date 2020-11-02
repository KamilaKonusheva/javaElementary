package lesson6;

import lesson6.exceptions.StringFormatException;
import lesson6.utils.InfoCheckHelper;
import lesson6.utils.StringHelper;

public class Main {
    public static void main(String[] args) throws StringFormatException {
        String string = "Kamila";
        char[] chars = {'k', 'o', 'n', 'u', 's', 'h', 'e', 'v', 'a'};

        StringHelper helper = new StringHelper();
        helper.stringChange(string, chars);

        InfoCheckHelper infoCheckHelper = new InfoCheckHelper();
        infoCheckHelper.phoneCheck("9463134");
        infoCheckHelper.phoneCheck("380509463134");
        infoCheckHelper.mailCheck("konuseval@gmail.com");
        infoCheckHelper.mailCheck("kamila");
        infoCheckHelper.birthDateCheck("21.11.1997");
        infoCheckHelper.birthDateCheck("21.11.97");
    }
}



