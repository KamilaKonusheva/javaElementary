package lesson28.threads;

import lesson28.MyHelper;

public class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                currentThread().setName("First thread");
                MyHelper.printThread(currentThread());
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

