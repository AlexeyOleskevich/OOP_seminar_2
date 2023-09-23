package pharmacy;

public class Penicilium extends Component{
    public Penicilium(String name, int power, String weight) {
        super(name, power, weight);
    }

    public Penicilium(String weight) {
        this("penicilium", 12, weight);
    }
}
