package _01_calendar;

import java.time.LocalTime;

public class T05_LocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        
        LocalTime anyTime = LocalTime.of(1,2,3);
        System.out.println(anyTime);
    }
}
