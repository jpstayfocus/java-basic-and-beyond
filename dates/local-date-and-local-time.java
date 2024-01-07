import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // localDate
        
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.minusDays(5));

        
        // localTime
        LocalTime localTime = LocalTime.now();
        System.out.println();
        System.out.println(localTime);

    }
}
