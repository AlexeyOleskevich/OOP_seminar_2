package animal;

public class Hummingbird extends Animal implements Flyable {

    public Hummingbird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getTYPE() + " is flying.");
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }
}
