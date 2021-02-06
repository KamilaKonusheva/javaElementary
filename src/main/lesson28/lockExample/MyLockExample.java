package lesson28.lockExample;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLockExample {
    private Lock lock = new ReentrantLock();

    public void printString() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println("My printString method is working");
        }
    }

    public void writeString() {
        for (int i = 0; i < 100; i++) {
            System.out.println("My writeString method is working");
        }
    }

    public void randomNumber() {
        Random random = new Random();
        int randomInt = random.nextInt(50);
        for (int i = 0; i < 100; i++) {
            System.out.println(randomInt);
        }
        lock.unlock();
    }
}
