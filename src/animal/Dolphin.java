package animal;

public class Dolphin extends Animal implements Swimmable{
    public Dolphin(String name) {
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
