package animal;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat =
                new Cat("", 12.0, new Owner("Alex"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())),Color.BLACK, "");
        Animal rat =
                new Rat("Rat");
        rat.swim();
    }
}
