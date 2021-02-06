package lesson27.deadlock;

public class FirstClass {

    private SecondClass second;

    public SecondClass getSecond() {
        return second;
    }

    public void setSecond(SecondClass second) {
        this.second = second;
    }

    public synchronized String getString() {
        return "Deadlock example";
    }

    public synchronized String getFromSecondClass() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return second.getString();
    }
}

