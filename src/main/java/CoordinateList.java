import org.lab.basic.Coordinate2D;

import java.util.ArrayList;
import java.util.List;

public class CoordinateList<E extends Coordinate2D> {
    private final List<E> list = new ArrayList<>();

    public void addCoordinate(E coordinate) {
        this.list.add(coordinate);
    }

    public List<?> getCoordinates() {
        return this.list;
    }
}
