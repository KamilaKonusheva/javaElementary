package lesson1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements Service {

    @Override
    public  boolean userCheck(MainEntity mainEntity) throws IOException {
        FileReader fileReader = new FileReader("src\\main\\resources\\userInfo");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String mail = scanner.nextLine();
            if (mail.equals(mainEntity)) {
                return true;
            }
        }
        scanner.close();
        fileReader.close();
        return false;
    }

    @Override
    public  void userInfoWriter(MainEntity mainEntity) throws IOException {
        System.out.println("This method is not available");
    }
}


