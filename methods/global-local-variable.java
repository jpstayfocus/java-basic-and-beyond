public class Main {

    private static final String BRAND = "jpstayfocus"; // global variable

    public static void main(String[] args) {
        // Global and Local Variable
        String country = "Canada"; // local variable
        System.out.println(country);
        foo();
    }
    private  static  void foo(){
        System.out.println(BRAND);
       // System.out.println(country); // wont print out cause variable is local
    }
}
