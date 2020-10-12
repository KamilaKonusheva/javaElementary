package lesson1;

public class Admin extends MainEntity {



    //тут сомневаюсь, нужен ли мне отдельный конструктор или подойдет вариант ниже

    public Admin(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "ADMIN");
    }
}