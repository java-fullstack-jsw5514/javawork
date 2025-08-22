package _01_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class T03_simpleDateFormat {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date());
        dates.add(new Date(2025-1900, Calendar.APRIL,7));
        
        ArrayList<SimpleDateFormat> formats = new ArrayList<>();
        formats.add(new SimpleDateFormat("yyyy-MM-dd"));
        formats.add(new SimpleDateFormat("yyyy/MM/dd"));
        formats.add(new SimpleDateFormat("yyyy-M-d"));
        formats.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        formats.add(new SimpleDateFormat("yyyy년 MM월 dd일 E요일"));
        
        for(SimpleDateFormat format : formats){
            for(Date date : dates){
                System.out.println(format.format(date));
            }          
        }
        System.out.println(("--------------------"));
        
        String dateString = "20251212";
        SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = simple.parse(dateString);
            for(SimpleDateFormat format : formats){
                System.out.println(format.format(date));
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        

    }
}
