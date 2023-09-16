package clinic;

import animal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic(new ArrayList<>());
        clinic.addAnimal(new Cat("", 12.0, new Owner("Alex"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK, ""));
        clinic.addAnimal(new Dog("", 12.0, new Owner("Alex"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK));
        clinic.addAnimal(new Mosquito("a", 15.0));
        for (Animal animal : clinic.getPacients()) {
            if (animal instanceof Flyable) {
                System.out.println(((Flyable) animal).getFlySpeed());
            }
            animal.heal();
        }



    }
}
