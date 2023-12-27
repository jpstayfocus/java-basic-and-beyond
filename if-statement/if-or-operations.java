import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // if statement
       String gender = "Female";
       if (gender.equalsIgnoreCase("Female") || gender.equals("Male")) {
           System.out.println("valid gender");
       } else {
           System.out.println("invalid gender");
       }
/*
        String gender = "Female";
        if (gender.equals("Female")){
            System.out.println("Valid gender");
        } else if (gender.equals("Male")) {
            System.out.println("valid gender");
        } else{
            System.out.println("invalid gender");
        }

        */
    }
}
