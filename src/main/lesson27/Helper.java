package lesson27;

public class Helper {
    private static Integer integer = 0;

    public synchronized static Integer threadPrint() {
            System.out.println(Thread.currentThread().getName() + " " + integer);
        return integer++;
    }
}
