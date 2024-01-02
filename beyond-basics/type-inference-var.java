public class Main {
    // private var brand = "jpstayfocus" (var cant work)
    public static void main(String[] args) {
        // Type inference with var keyword (works for every datatype,
        // but can be used only for local variables)

        /*
        String name = "Jamila";
        String[] names = {"Jamila", "Joseph"};
        int age = 22;
        boolean isAdult = false;
        double balance = 1_000_000.33;
        */

        var name = "Jamila";
        var names = new String[]{"Jamila", "Joseph"};
        var age = 22;
        var isAdult = false;
        var balance = 1_000_000.33;
    }
    }
