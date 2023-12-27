import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  loops and arrays
        String[] names = {"Jones", "Peter", "Jacon", "Maraket", "Mikah"};

        System.out.println("For i loop");
        for (int i = 0; i < names.length; i++){ // i can be anything
            System.out.println(names[i]);
        }
        System.out.println();
        System.out.println("Enhanced for loop");
        for(String name : names) {
            System.out.println(name);
        }


        /*
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println();
        System.out.println("Length of the array is " + names.length);
        */

    }
}
