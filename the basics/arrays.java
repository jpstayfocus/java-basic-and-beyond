import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays ; data structure that allows to store multiple values in one variable
        int[] numbers = new int[3];  // size define
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length); // find the size of the array

        System.out.println();
        int[] numbers2 = {0, 5, 6, 8, 9}; // shorthand version of the above array
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 55; // change index 1  by 55
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

    }
}
