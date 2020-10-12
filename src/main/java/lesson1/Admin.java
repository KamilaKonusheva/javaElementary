package lesson1;

public class Admin extends MainEntity {
    
    public Admin(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "ADMIN");
    }
}
