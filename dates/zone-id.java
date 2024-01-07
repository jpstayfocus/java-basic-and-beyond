import java.time.*;

public class Main {

    public static void main(String[] args) {
        // Working with dates
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime NowInKabul =
                LocalDateTime.now(ZoneId.of("Asia/Kabul"));
        System.out.println(now);
        System.out.println(NowInKabul);
        for (String zone: ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }

    }
}
