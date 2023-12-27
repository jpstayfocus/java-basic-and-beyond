import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // if statement
        int age = 2;
        boolean isAdult = age >= 16;

        if (isAdult) {
            System.out.println("is adult :-)");
        } else if(age == 1){
            System.out.println("toddler :-)");
        }else if(age == 2){
            System.out.println("toddler :-)");
        }else if(age == 0){
            System.out.println("baby :-)");
        }else if(age == 4){
            System.out.println("baby :-)");
        } else{
            System.out.println("is not adult :-(");
        }
    }
}
