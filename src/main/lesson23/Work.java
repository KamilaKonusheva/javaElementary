package lesson23;

public interface Work {

    default void walk(int timeToWork) {
        System.out.println("It takes me " + timeToWork + "min to get to work");
    }

    static void workActivity() {
        System.out.println("I'm busy now. I'm working!");
    }

    void workingHours(int hours);

    void lunchTime(int hours);
}
