package animal;

import clinic.Doctor;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Runnable {
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color, new Doctor("Ivan", 65.0, 182));
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