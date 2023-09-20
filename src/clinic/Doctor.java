package clinic;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human implements Healable {
    private String specialization;
    private String classification;
    private List<Animal> patients;
    private Nurse nurse;
    public Doctor(String name, double weight, int tail) {
        super(name, weight, tail);
        patients = new ArrayList<>();
    }

    public Doctor(String name, double weight, int tail, Nurse nurse) {
        super(name, weight, tail);
        this.nurse = nurse;
    }

    @Override
    public void heal(Animal animal) {
        System.out.println("Doctor " + this.getName() +  "cured the "+ animal.getTYPE() + ".");
    }

    public Doctor addPatient(Animal animal) {
        if (animal == null) {
            throw new NullPointerException("Animal cannot be null.");
        }
        patients.add(animal);
        return this;
    }

    public Doctor dischargePatient(Animal animal) {
        if (patients.contains(animal)) {
            patients.remove(animal);
        }
        else {
            System.out.println("There is no such animal in the list of patients.");
        }
        return this;
    }

    public void giveAssignment(String assignment) {
        this.nurse.addAssignment(assignment);
    }

    public void replaceNurse(Nurse newNurse) {
        if (newNurse != null) {
            this.nurse = newNurse;
        }
        else {
            throw  new NullPointerException("Nurse cannot be null.");
        }
    }
}
