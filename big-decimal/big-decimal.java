public class Main {

    public static void main(String[] args) {
        // big decimal

        BigDecimal number1 = new BigDecimal("0.02");
        BigDecimal number2 = new BigDecimal("0.03");
        BigDecimal result = number2.subtract(number1); //
        System.out.println(result); 

    }
}
