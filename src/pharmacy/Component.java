package pharmacy;

import java.util.Objects;

public class Component {
    private String name;
    private int power;
    private String weight;

    public Component(String name, int power, String weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    public int getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return power == component.power && name.equals(component.name) && weight.equals(component.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, weight);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", power=" + power + ", weight='" + weight + '\'';
    }
}
