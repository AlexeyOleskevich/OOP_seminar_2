package animal;

import clinic.Doctor;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Runnable {
    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color, new Doctor("Igor", 12.0, 45));
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
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