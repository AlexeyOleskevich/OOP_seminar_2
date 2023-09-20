package clinic;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Human{
    private List<String> assignments;
    public Nurse(String name, double weight, int tail) {
        super(name, weight, tail);
        assignments = new ArrayList<>();
    }

    public Nurse addAssignment(String assignment) {
        assignments.add(assignment);
        return this;
    }
}
