package lesson28;

import java.util.concurrent.atomic.AtomicInteger;

public class MyHelper {
    public static AtomicInteger atomicInteger = new AtomicInteger();

    public synchronized static void printThread(Thread thread) {
        System.out.println(thread.getName() + "Decrement: " + atomicInteger.decrementAndGet());
    }
}

