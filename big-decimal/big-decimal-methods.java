import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // big decimal

        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.ONE));
        System.out.println(number.max(BigDecimal.ZERO));
        System.out.println(number.compareTo(BigDecimal.ZERO));
        System.out.println(number.compareTo(new BigDecimal("11")));
    }
}
