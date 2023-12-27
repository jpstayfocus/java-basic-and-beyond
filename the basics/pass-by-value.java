import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Pass by value with object
        int age = 21; // primitive
        Point pointA = new Point(10, 10); // reference type allows to store more complex value
        Point pointB =pointA;
        pointA.x = 100;
        pointB.y =  90;

        System.out.println(pointA);
        System.out.println(pointB);


    }
}
