public class Main {

    public static void main(String[] args) {
        // Type Casting - Convert one data type to another
      
        // Implicit Type (Widening) Casting
        System.out.println();
        System.out.println("Implicit Type (Widening) Casting");
        int balance = 100;
        // convert int to double without losing any value
        double balanceInDouble = balance;
        System.out.println(balance);
        System.out.println(balanceInDouble);
      
        // Explicit Type (Narrowing Casting
        System.out.println();
        System.out.println("Explicit Type (Narrowing Casting");
        double remainingBalance = 100.55;
        double remainingBalanceInt = (int) remainingBalance;
        System.out.println(remainingBalance);
        System.out.println(remainingBalanceInt); // lose .55 cents
    }
}
