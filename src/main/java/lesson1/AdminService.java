package lesson1;


import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class AdminService implements Service {

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
        FileWriter fileWriter = new FileWriter("src\\main\\resources\\userInfo",true);
        fileWriter.write(String.valueOf(mainEntity)+ "\n");
        fileWriter.close();
    }
}
