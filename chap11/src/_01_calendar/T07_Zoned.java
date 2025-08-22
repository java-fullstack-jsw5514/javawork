package _01_calendar;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T07_Zoned {
    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(seoul);
        
        ZonedDateTime LA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(LA);
        
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(london);
        
        //Calendar 에서 zone 변경방법
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar calendar = Calendar.getInstance(tz); //타임존에 해당하는 Calendar 객체 인스턴스 획득
        calendar.setTimeZone(tz);
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(calendar.getTime()));
    }
}
