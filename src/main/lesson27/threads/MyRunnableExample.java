package lesson27.threads;

import static lesson27.Helper.threadPrint;

public class MyRunnableExample implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("My runnable thread example");
        for (int i = 0; i < 1000; i++) {
            threadPrint();
            // System.out.println("2");
        }
    }
}
