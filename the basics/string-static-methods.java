public class Main {

    public static void main(String[] args) {
        // Strings
        String number = String.valueOf(1);
        System.out.println(number);
        String format = String.format("Number %s", number);
        System.out.println(format);
        String[] names = {"Jamila", "Alex", "Aisha"};
        String join = String.join(" | ", names);
        System.out.println(join);
    }
}
