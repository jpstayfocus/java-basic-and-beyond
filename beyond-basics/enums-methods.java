public class Main {

    public static void main(String[] args) {
        // Enums (define constant)
        Gender male = Gender.MALE;
        System.out.println(male); // to extract : options+command+V
        Gender female = Gender.FEMALE;
        System.out.println(female);

        System.out.println(Gender.valueOf("FEMALE"));
        System.out.println(Arrays.toString(Gender.values()));

        System.out.println(GenderConstants.FEMALE); // string
        System.out.println(GenderConstants.MALE); // String
    }
}
