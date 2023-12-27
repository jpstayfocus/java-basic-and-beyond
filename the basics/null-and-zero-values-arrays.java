import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array null values
        int[] numbers = new int[3];
        Arrays.fill(numbers, -1); // have default value other than zero (primitive)
        numbers[2] = 27;
        System.out.println(Arrays.toString(numbers));
        String[] names = new String[3];
        names[1] = "Jamila";
        System.out.println(Arrays.toString(names)); // for object default value is null
    }
}
