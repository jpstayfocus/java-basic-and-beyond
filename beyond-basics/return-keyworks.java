public class Main {
    public static void main(String[] args) {
        // Break and Continue
        var names = new String[]{
                "James",
                "Pedro",
                "Ali",
                "Jones",
                "Matt",
                "Andre"
        };

        for (String name: names){
            if (name.startsWith("A")){
                return; // used to exit out of a method
            }
            System.out.println(name);
        }
        System.out.println("end of main method");
    }
}
