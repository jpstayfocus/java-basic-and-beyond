import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  loops and arrays
        String[] names = {"Jones", "Peter", "Jacon", "Maraket", "Mikah"};

        System.out.println("For i loop");  // used when you want to have access element within a array by the given index
        for (int i = 0; i < names.length; i++){ // i can be anything
            String prev = names[i-1];
            String current = names[i];
            String next = names[i+1];
            System.out.println(current);
        }
        
        System.out.println();
        System.out.println("Enhanced for loop");  // have no control, it just loops from start to finish
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
