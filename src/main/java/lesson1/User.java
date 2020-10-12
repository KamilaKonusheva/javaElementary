package lesson1;

import java.util.Objects;

public class User extends MainEntity {
    public User(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "USER");
    }

}
