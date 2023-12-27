import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // while loops
        int i = 5;
        boolean keepLooping = true; // never runs
        do {
            System.out.println("hello " + i++ );
            keepLooping = false;
        }
        while (keepLooping);

    }
}
