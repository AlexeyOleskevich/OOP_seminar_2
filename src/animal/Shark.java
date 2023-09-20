package animal;

public class Shark extends Animal implements Swimmable{

    public Shark(String name, double weight) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getTYPE() + " is swimming.");
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }
}
