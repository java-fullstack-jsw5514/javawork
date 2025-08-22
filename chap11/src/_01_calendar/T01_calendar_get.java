package _01_calendar;

import java.time.LocalDateTime;
import java.util.Calendar;

public class T01_calendar_get {
    public static void main(String[] args) {
        Calendar today =  Calendar.getInstance();
        System.out.println("year: "+today.get(Calendar.YEAR));
        System.out.println("month: "+(today.get(Calendar.MONTH)+1));
        System.out.println("day: "+today.get(Calendar.DAY_OF_MONTH));
        System.out.println("hour: "+today.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute: "+today.get(Calendar.MINUTE));
        System.out.println("second: "+today.get(Calendar.SECOND));
        System.out.println("---------------------------");
        
        System.out.println("day of year: "+today.get(Calendar.DAY_OF_YEAR));
        
        boolean isAM = today.get(Calendar.AM_PM) == Calendar.AM;
        int hour = today.get(Calendar.HOUR);
        String value = String.format((isAM?"AM":"PM")+" %02d시",hour);
        System.out.println(value);
    }
}
