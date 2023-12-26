
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // reference type / objects
        int age = 21; // primitive
        Point pointA = new Point(10, 10); // reference type allows to store more complex value
        System.out.println("pointA = " + pointA);
        pointA.move(10, 11);
        System.out.println("pointA = " + pointA);

    }
}
