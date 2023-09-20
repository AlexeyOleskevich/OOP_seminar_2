package clinic;

import animal.Animal;
import animal.Flyable;
import animal.Swimmable;

import java.util.ArrayList;
import java.util.List;

public final class VeterinaryClinic {
    private List<Animal> patients;

    public VeterinaryClinic() {
        this.patients = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        patients.add(animal);
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Animal> getRunnable() {
        List<Animal> runnableAnimals = new ArrayList<>();
        for (Animal animal : runnableAnimals) {
            if (animal instanceof Runnable) {
                runnableAnimals.add(animal);
            }
        }
        return runnableAnimals;
    }

    public List<Animal> getSwimmable() {
        List<Animal> swimmableAnimals = new ArrayList<>();
        for (Animal animal : swimmableAnimals) {
            if (animal instanceof Swimmable) {
                swimmableAnimals.add(animal);
            }
        }
        return swimmableAnimals;
    }

    public List<Animal> getFlyable() {
        List<Animal> flyableAnimals = new ArrayList<>();
        for (Animal animal : flyableAnimals) {
            if (animal instanceof Flyable) {
                flyableAnimals.add(animal);
            }
        }
        return flyableAnimals;
    }

    public VeterinaryClinic addPatient(Animal patient) {
        this.patients.add(patient);
        return this;
    }
}
