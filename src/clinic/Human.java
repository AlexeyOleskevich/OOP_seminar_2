package clinic;
public abstract class Human{
    private String name;
    private double weight;
    private int tail;

    public Human(String name, double weight, int tail) {
        this.name = name;
        this.weight = weight;
        this.tail = tail;
    }

    public String getName() {
        return this.name;
    }
}
