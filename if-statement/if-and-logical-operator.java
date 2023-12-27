
public class Main {
    public static void main(String[] args) {
    // if statement
        int age = 4;
        boolean isAdult = age >= 16;

        if (isAdult) {
            System.out.println("is adult :-)");
        }
        else if (age == 0){
            System.out.println("baby :-)");
        }
        else if(age > 0 && age <= 3){ // both condition must be true for the if statement to be executed
            System.out.println("toddler :-)");
        } else{
            System.out.println("is not adult :-(");
        }
    }
}
