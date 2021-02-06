package lesson27.deadlock;

public class SecondClass {
    private FirstClass first;

    public FirstClass getFirstClass() {
        return first;
    }

    public void setFirstClass(FirstClass firstClass) {
        this.first = firstClass;
    }

    public synchronized String getString() {
        return "Second deadlock example";
    }

    public synchronized String getFromFirstClass() {
        return first.getString();
    }
}

