package lesson2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class InitializationData {
    private Information information;

    public InitializationData() {
        information = new Information();
    }

    public Information dataWriter() {
        for (int i = 0; i < 30; i++) {
            information.getLogin().add("kamila" + i);
            information.getMail().add("kamila" + i + "@mail.ua");
            information.getUserInfo().put("kamila" + i + "@mail.ua", "kamila" + i);
        }
        for (int i = 0; i < 10; i++) {
            information.getMail().add("konusheva@mail.ua");

            if (information.getLogin().size() <= information.getMail().size()) {
                information.getLogin().add("konusheva");
            }
            information.getUserInfo().put("konusheva@mail.ua", "konusheva");
        }
        return information;
    }
}
