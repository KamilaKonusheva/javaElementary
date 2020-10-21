package lesson4;

import lesson4.entities.Client;
import lesson4.exceptions.WrongFieldException;
import lesson4.exceptions.WrongSumException;
import lesson4.services.TransactionService;
import lesson4.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.setAccountId("1234567890");
        client.setClientId("1234567890");
        client.setSurname("Konusheva");

        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();

        String accountId;
        do {
            System.out.println("Enter your Account ID:");
            accountId = scanner.nextLine();
            try {
                helper.lengthCheck(accountId);
            } catch (WrongFieldException e) {
                System.out.println("Account ID is longer/shorter than 10. Check it and try again!");
            }
        } while (accountId.length() != 10);

        String recipientId;
        do {
            System.out.println("Enter recipient ID:");
            recipientId = scanner.nextLine();
            try {
                helper.lengthCheck(recipientId);
            } catch (WrongFieldException e) {
                System.out.println("Recipient ID is longer/shorter than 10. Check it and try again!");
            }
        } while (recipientId.length() != 10);

        double amount;
        do {
            System.out.println("Enter amount of money your want to transfer to this ID:");
            amount = scanner.nextDouble();
            try {
                helper.amountCheck(amount);
            } catch (WrongSumException e) {
                System.out.println("The amount you entered exceeds the limit of 1000. Try again!");
            }
        } while (amount > 1000);

        TransactionService transactionService = new TransactionService();
        transactionService.moneySender(client, accountId);
        System.out.println("Your transfer is succeed!");
    }
}
