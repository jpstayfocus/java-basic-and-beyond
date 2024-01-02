public class Main {
    public static void main(String[] args) {
        // Break and Continue
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (int number : numbers){
            //System.out.println(number);
            if (number == 3){
                break;
            }
            System.out.println(number);
        }

    }
}
