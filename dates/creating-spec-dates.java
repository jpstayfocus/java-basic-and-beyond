import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        // Working with dates
        LocalDateTime someDate = LocalDateTime.of(
                2000,
                Month.DECEMBER,
                1,
                14,
                55,
                22
        );
        System.out.println(someDate);

        LocalDate someDate2 = LocalDate.of(
                2000,
                Month.DECEMBER,
                1
        );

        LocalTime someTime =  LocalTime.of(
                12,55, 55
        );
        

    }
}
