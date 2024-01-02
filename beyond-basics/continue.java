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
                continue;
            }
            System.out.println(name);
        }

    }
}
