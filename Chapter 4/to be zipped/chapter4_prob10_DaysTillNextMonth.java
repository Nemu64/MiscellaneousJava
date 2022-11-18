import java.time.LocalDate;
import java.util.Calendar;

public class DaysTillNextMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        LocalDate date = LocalDate.of(cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DAY_OF_MONTH)); //We have to add 1 to get calendar month since it starts counting at 0
        System.out.println("There are " + (date.lengthOfMonth() - date.getDayOfMonth()) + " days left in the month.");
    }
}