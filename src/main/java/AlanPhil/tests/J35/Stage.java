package AlanPhil.tests.J35;

abstract class Stage {
    int length;
    String description;

    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);

}
