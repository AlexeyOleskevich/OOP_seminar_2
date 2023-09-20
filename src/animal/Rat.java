package animal;

public class Rat extends Animal implements Runnable{
    public Rat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.TYPE + " is running.");
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }
}
