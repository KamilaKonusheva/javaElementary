package lesson1;

import java.io.IOException;

import static lesson1.User.*;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("alex", "frolov", 23,
                "alex2000@mail.ru", "2222as", "USER");
        Admin admin = new Admin("mike", "antonenko", 33,
                "mike@gmail.com", "33333", "ADMIN");
        UserService userService = new UserService();
        AdminService adminService = new AdminService();
        userService.userInfoWriter(user);
        adminService.userInfoWriter(user);
        adminService.userInfoWriter(admin);
        adminService.userCheck(user);
        userService.userCheck(user);
    }
}
