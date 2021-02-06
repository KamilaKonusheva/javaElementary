package lesson27.threads;

import static lesson27.Helper.threadPrint;

public class MyThreadExample extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("My thread example");
        for (int i = 0; i < 1000; i++) {
            threadPrint();
            // System.out.println("1");
        }
    }
}
