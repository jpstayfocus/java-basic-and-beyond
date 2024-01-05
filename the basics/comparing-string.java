public class Main {

    public static void main(String[] args) {
        // Strings
        String name1 = "Jamila";
        String name2 = "Jamila";
        //name2 = "Alex";
        String name3 = new String("Jamila"); // this creates a new object in the heap 
        System.out.println(1 == 1);
        System.out.println(name1 == name2); // dont use == to compare string
        System.out.println(name1 == name3); // use == to check if the reference point to the same object
        System.out.println("String equality with ==");
        System.out.println(name1.equals(name2)); // use .equals to compare string instead
        System.out.println(name1.equals(name3));
        
    }
}
