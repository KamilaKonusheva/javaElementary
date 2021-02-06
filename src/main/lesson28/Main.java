package lesson28;

import lesson28.lockExample.MyLockExample;
import lesson28.threads.FirstThread;
import lesson28.threads.SecondThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //1

        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        firstThread.start();
        secondThread.start();
        Thread.sleep(10000);
        System.out.println(MyHelper.atomicInteger);


        //2 Lock

        Thread thread1 = new Thread(new Runnable() {
            private MyLockExample lockExample = new MyLockExample();

            @Override
            public void run() {
                Thread.currentThread().setName("First thread");
                lockExample.printString();
                lockExample.writeString();
                lockExample.randomNumber();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            private MyLockExample lockExample = new MyLockExample();

            @Override
            public void run() {
                Thread.currentThread().setName("Second thread");
                lockExample.printString();
                lockExample.writeString();
                lockExample.randomNumber();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            private MyLockExample lockExample = new MyLockExample();

            @Override
            public void run() {
                Thread.currentThread().setName("Third thread");
                lockExample.printString();
                lockExample.writeString();
                lockExample.randomNumber();
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }
}
