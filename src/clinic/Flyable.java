package clinic;

import java.io.Serializable;

public interface Flyable extends Illable, Serializable {
    double getFlySpeed();
}
