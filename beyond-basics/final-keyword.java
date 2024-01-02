public class Main {

    // create constant
    // public static final String NAME = "Alex";

    public static void main(String[] args) {
        // Final keyword: allows to create constants, prevent inheritance,
        // and method overriding
        final var name = "Alex";
        //name =  "Jamila";
        System.out.println(name);
        //System.out.println(NAME);
        final Point p = new Point();
        p.y = 10; // not final
        p.y = 90;
    }
}
