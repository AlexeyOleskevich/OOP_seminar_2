package animal;

import clinic.Illable;

import java.time.LocalDate;
import java.util.List;

public class Animal implements Illable {
    protected String name;
    protected double weight;
    protected Owner owner;
    protected LocalDate birthDay;
    protected List<Vaccination> vaccinations;
    protected Color color;
    protected final String TYPE = this.getClass().getSimpleName();

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
    }

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        this(name, weight, owner, birthDay, null, color);
    }

    public Animal(String name) {
        this.name = name;
    }


    public void lifeCycle() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    private void wakeUp() {
        System.out.println(this.TYPE + " проснулся.");
    }

    public void toGo() {
        System.out.println(this.TYPE + " двигается.");
    }

    public void fly() {
        if (!(this.TYPE.equals(Mosquito.class.getSimpleName()) || this.TYPE.equals(Hummingbird.class.getSimpleName()))) {
            System.out.println(this.TYPE + " не умеет летать");
        } else {
            System.out.println(this.TYPE + " летает.");
        }
    }

    public void swim() {
        if (!(this.TYPE.equals(Shark.class.getSimpleName()) || this.TYPE.equals(Dolphin.class.getSimpleName()))) {
            System.out.println(this.TYPE + " не умеет плавать");
        } else {
            System.out.println(this.TYPE + " плавает.");
        }
    }

    private void findFood() {
        System.out.println(this.TYPE + " ищет еду.");
    }

    private void eat() {
        System.out.println(this.TYPE + " кушает.");
    }

    private void toPlay() {
        System.out.println(this.TYPE + " играет.");
    }

    private void goToSleep() {
        System.out.println(this.TYPE + " собирается спать.");
    }

    public void sound() {
        System.out.println(this.TYPE + " издает звук.");
    }

    // getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

    @Override
    public void heal() {
        System.out.println("Ветеринар лечит " + this.TYPE);
    }
}