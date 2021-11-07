import org.lab.basic.Coordinate2D;
import org.lab.basic.Coordinate3D;
import org.lab.basic.Coordinate4D;
import java.util.List;

public class CoordinateMainApp<E extends Coordinate2D> {
    private void getXyCoordinates(List<E> list) {
        for (E elem: list) {
            System.out.println("X - " + elem.getX() + ",   Y - " + elem.getY());
        }
    }

    private void getXyzCoordinates(List<E> list) {
        for (E elem: list) {
            try {
                System.out.println("X - " + elem.getX() + ",   Y - " + elem.getY() + ",   Z - " + zHelper((Coordinate3D) elem));
            } catch (ClassCastException e) {
                System.out.println("Got 2D point!");
            }
        }
    } // EZ

    private Number zHelper(Coordinate3D coord) {
        return coord.getZ();
    }

    public static void main(String[] args) {
        CoordinateList coordinateList = new CoordinateList();
        CoordinateMainApp main = new CoordinateMainApp();


        coordinateList.addCoordinate(new Coordinate2D(1, 2));
        coordinateList.addCoordinate(new Coordinate3D(1, 2, 3));
        coordinateList.addCoordinate(new Coordinate4D(1, 2, 3, 4));
        coordinateList.addCoordinate(new Coordinate2D(1, 2));

        System.out.println("Get XY of all points in list:");
        main.getXyCoordinates(coordinateList.getCoordinates());
        System.out.println("Get XYZ of all points in list:");
        main.getXyzCoordinates(coordinateList.getCoordinates());
    }
}
