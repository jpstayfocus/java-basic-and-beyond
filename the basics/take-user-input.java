import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner
        System.out.println("Hello, what is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);
    }
}
