package hemel.ClassTwentyOne;


import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class allTimeZones {
    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Formatter for displaying the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current time in all time zones:\n");

        // Iterate through all zone IDs and display the current time
        for (String zoneId : zoneIds) {
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
            System.out.println(zoneId + " -> " + zonedDateTime.format(formatter));
        }
    }
}
