package hemel.ClassTwentyOne;

import java.time.LocalDate;
import java.time.YearMonth;

public class LastDateOfMonth {
    public static void main(String[] args) {
        // Get the current year and month
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();

        // Get the last date of the current month
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate lastDate = yearMonth.atEndOfMonth();

        // Print the last date of the current month
        System.out.println("The last date of the month is: " + lastDate);
    }
}
