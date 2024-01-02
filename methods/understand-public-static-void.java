
public class Main {
    public static void main(String[] args) {
        // understand public static void main(String[] args)
                /*
                - Public means this method is accessible
                - static means there is no need to create an instance of public class Main
                and can be invoked directly by saying main.(name of the method)
                - void means that this method (public static) does not return anything
                - main means that this is the main method. (special and needed by the jvm, cannot be changed)
                - String[] args (programs argument)
                */
        System.out.println("Program was given");
        if (args.length > 0) {
            System.out.println("The following arguments");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("0 argument");
        }

    }
}
