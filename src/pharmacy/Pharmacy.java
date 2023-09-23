package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int index;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.index = 0;
    }


    public Pharmacy addComponent(Component component) {
        if (component == null) throw new NullPointerException("Component cannot be null.");
        components.add(component);
        return this;
    }

    public List<Component> getComponents() {
        return this.components;
    }

    public int getComponentsPower() {
        int sum = 0;
        for (Component component : this.components) {
            sum += component.getPower();
        }
        return sum;
    }

    private int compareByComponentsName(Pharmacy pharmacy) {
        int winsAmountThisPharmacy = 0;
        int winsAmountAnotherPharmacy = 0;
        for (int i = 0; i < components.size(); i++) {
            String currentThisName = this.components.get(i).getName();
            String currentAnotherPharmacyName = pharmacy.getComponents().get(i).getName();
            if (currentThisName.compareTo(currentAnotherPharmacyName) > 0) {
                winsAmountThisPharmacy++;
            } else if (currentThisName.compareTo(currentAnotherPharmacyName) < 0) {
                winsAmountAnotherPharmacy++;
            }
        }
        if (winsAmountThisPharmacy > winsAmountAnotherPharmacy) return 1;
        else if (winsAmountThisPharmacy < winsAmountAnotherPharmacy) return -1;
        else return 0;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }


    @Override
    public int compareTo(Pharmacy pharmacy) {
        if (this.getComponentsPower() == pharmacy.getComponentsPower()) {
            int amountThisComponents = this.components.size();
            int amountAnotherComponents = pharmacy.components.size();
            if (amountThisComponents == amountAnotherComponents) {
                return this.compareByComponentsName(pharmacy);
            }
            return amountThisComponents > amountAnotherComponents ? 1 : -1;
        }
        return this.getComponentsPower() > pharmacy.getComponentsPower() ? 1 : -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return components.equals(pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                components.toString() +
                '}';
    }
}
