package animal;

import clinic.Flyable;

public class Mosquito extends Animal implements Flyable {
    private double speed;


    public Mosquito(String name, double speed) {
        super("unnamed");
        this.speed = speed;
    }

    @Override
    public double getFlySpeed() {
        return 15.0;
    }
}
