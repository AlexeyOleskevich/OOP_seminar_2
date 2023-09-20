package animal;

public class Mosquito extends Animal implements Flyable {
    private double speed;


    public Mosquito(String name, double speed) {
        super("unnamed");
        this.speed = speed;
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
