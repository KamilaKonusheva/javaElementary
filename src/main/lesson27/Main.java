package lesson27;

import lesson27.deadlock.FirstClass;
import lesson27.deadlock.SecondClass;
import lesson27.threads.MyCallableExample;
import lesson27.threads.MyRunnableExample;
import lesson27.threads.MyThreadExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyThreadExample threadExample = new MyThreadExample();
        threadExample.start();
        //threadExample.join();

        MyRunnableExample runnableExample = new MyRunnableExample();
        Thread runnableThread = new Thread(runnableExample);
        runnableThread.start();
        //runnableThread.join();

        MyCallableExample callableExample = new MyCallableExample();
        FutureTask<String> task = new FutureTask<>(callableExample);
        Thread callableThread = new Thread(task);
        callableThread.start();
        //callableThread.join();
        String result = task.get();
        System.out.println(result);

        // 5.1 2691 - 2999
        // 5.2 2475 - 2999
        // 5.3 1999 - 2999

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        firstClass.setSecond(secondClass);
        secondClass.setFirstClass(firstClass);
        Thread first = new Thread(() -> System.out.println(firstClass.getFromSecondClass()));
        Thread second = new Thread(() -> System.out.println(secondClass.getFromFirstClass()));
        first.start();
        second.start();

    }
}
