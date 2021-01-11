package lesson23;

public interface Hobby extends Action {

    default void walk() {
        System.out.println("Walking is some kind of hobby for me");
    }

    static void hobby(String hobby) {
        System.out.println("My hobby is " + hobby);
    }

    void timeForHobby(int hours);

    void someInformation(String aboutHobby);
}
