package lesson23;

public interface Relax extends Work {

    default void walk() {
        System.out.println("I go for a walk to relax");
    }

    static void relax() {
        System.out.println("Today I want to relax!");
    }

    void swimming();

    void relaxationAdvice();
}
