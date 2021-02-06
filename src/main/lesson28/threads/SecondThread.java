package lesson28.threads;

import lesson28.MyHelper;

public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                currentThread().setName("Second thread");
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
            



