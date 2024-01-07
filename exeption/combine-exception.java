    public static void main(String[] args) {
        // Exception

        try{
            int number  = Integer.parseInt("1"); // if you add 1x the first catch will be executed
            System.out.println(number);

            for ( int i=10; i>=0; i--){
                System.out.println(10 / i);
            }

            // we can combine two exceptions into one
        } catch (NumberFormatException | ArithmeticException e){ // since e is an object, then
            System.out.println(e.getMessage());
            // you can print the stack Trace
            e.printStackTrace();
        }
    }
}
