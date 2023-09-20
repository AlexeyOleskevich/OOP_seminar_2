package animal;

import clinic.Human;

public class Owner extends Human {
    private String fullName;

    public Owner(String fullName, double weight, int tail) {
        super(fullName, weight, tail);
        this.fullName = fullName;
    }

}