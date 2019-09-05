import java.util.GregorianCalendar;
import java.util.HashMap;

public class _24_WeekdayName {

    public static String weekday_name( int weekday ) {
        HashMap<Integer, String> daysNames = new HashMap<>();
        daysNames.put(1, "Sunday");
        daysNames.put(2, "Monday");
        daysNames.put(3, "Tuesday");
        daysNames.put(4, "Wednesday");
        daysNames.put(5, "Thursday");
        daysNames.put(6, "Friday");
        daysNames.put(7, "Saturday");
        daysNames.put(0, "Saturday");
        String result = daysNames.get(weekday);
        return result;
    }

    public static void main( String[] args ) {
        System.out.println( "Weekday 1: " + weekday_name(1) );
        System.out.println( "Weekday 2: " + weekday_name(2) );
        System.out.println( "Weekday 3: " + weekday_name(3) );
        System.out.println( "Weekday 4: " + weekday_name(4) );
        System.out.println( "Weekday 5: " + weekday_name(5) );
        System.out.println( "Weekday 6: " + weekday_name(6) );
        System.out.println( "Weekday 7: " + weekday_name(7) );
        System.out.println( "Weekday 0: " + weekday_name(0) );
        System.out.println();
        System.out.println( "Weekday 43: " + weekday_name(43) );
        System.out.println( "Weekday 17: " + weekday_name(17) );
        System.out.println( "Weekday -1: " + weekday_name(-1) );

        GregorianCalendar cal = new GregorianCalendar();
        int dow = cal.get(GregorianCalendar.DAY_OF_WEEK);

        System.out.println( "\nToday is " + weekday_name(dow) + "!" );
    }
}
