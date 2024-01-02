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

// create a class with emum

public enum Gender {
      // Gender
        MALE,
        FEMALE
}

public enum TShirtSize {
    S,
    M,
    L,
    XL
}

public class GenderConstants {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
}
