package pharmacy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(new Component("B", 10, "1 mg")).addComponent(new Component("C", 12, "1 mg"));
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("B", 10, "1 mg")).addComponent(new Component("C", 12, "1 mg"));
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("abc", 12, "1 mg")).addComponent(new Component("B", 22, "1 mg"));

        System.out.println(pharmacy1.equals(pharmacy2));

        System.out.println(pharmacy1.compareTo(pharmacy2));

        Set<Pharmacy> result = new HashSet<>(Arrays.asList(pharmacy1, pharmacy2, pharmacy3));
        System.out.println(result);
    }
}
