package lesson23;

public class Man implements Action, Hobby {

    @Override
    public void freeTime() {
        System.out.println("I like to action at my free time");
    }

    @Override
    public void sleep(int time) {
        System.out.println("I go to bad at " + time);
    }

    @Override
    public void timeForHobby(int hours) {
        System.out.println("I spend " + hours + " hours doing hobby");
    }

    @Override
    public void someInformation(String aboutHobby) {
        System.out.println("Features of my hobby:" + aboutHobby);
    }
}
