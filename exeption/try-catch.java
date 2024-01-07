public class Main {

    public static void main(String[] args) {
        // Exception

        try{
            int number  = Integer.parseInt("1x");
            System.out.println(number);
        } catch (NumberFormatException e){
            System.out.println("Failed to parse 1x");
        }


        /*
        for ( int i=10; i>=0; i--){
            System.out.println(10 / i);
        }

        */
    }
}
