 public class Main {

    public static void main(String[] args) {
        // Exception

        try{
            int number  = Integer.parseInt("1"); // if you add 1x the first catch will be executed
            System.out.println(number);

            for ( int i=10; i>=0; i--){
                System.out.println(10 / i);
            }
        } catch (NumberFormatException e){
            System.out.println("Failed to parse 1x");
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

    }
}
