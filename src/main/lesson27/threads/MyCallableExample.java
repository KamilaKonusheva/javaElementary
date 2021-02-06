package lesson27.threads;

import java.util.concurrent.Callable;

import static lesson27.Helper.threadPrint;

public class MyCallableExample implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.currentThread().setName("My callable thread example");
        for (int i = 0; i < 1000; i++) {
            threadPrint();
            // System.out.println("3");
        }
        return "Finished";
    }
}
