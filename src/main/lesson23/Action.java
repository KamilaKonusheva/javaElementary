package lesson23;

public interface Action {
    default void walk() {
        System.out.println("I am walking!");
    }

    static void move() {
        System.out.println("Today I want to move a lot!");
    }

    void freeTime();

    void sleep(int time);
}
