package lesson23;

import java.util.Scanner;

public class Women implements Work, Relax {
    @Override
    public void swimming() {
        System.out.println("When I swim, I feel myself relaxing");
    }

    @Override
    public void relaxationAdvice() {
        System.out.println("Please, choose whichever relax you more: 1- active activities, 2- quiet activities. " +
                "Enter 1 or 2:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("You can exercise or play games with your friends to relax.");
        }
        if (choice == 2) {
            System.out.println("You can visit spa-centre or listen to music to relax. ");
        } else {
            System.out.println("You entered wrong number");
        }
        scanner.close();
    }

    @Override
    public void workingHours(int hours) {
        System.out.println("Working hours: " + hours);

    }

    @Override
    public void lunchTime(int hours) {
        System.out.println("Lunch time: " + hours);

    }
}
