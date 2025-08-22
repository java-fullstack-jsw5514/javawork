package _01_calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class T04_localDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        //getMonth는 Enum 타입을 리턴, 숫자를 얻고싶다면 getMonthValue
        System.out.printf("%d년 %s월 %d일",now.getYear(),now.getMonthValue(),now.getDayOfMonth());
        System.out.println("now.getYear() :" +  now.getYear());
        System.out.println("now.getMonth() :" +  now.getMonth()); // enum 타입(java.time.month)
        System.out.println("now.getMonthValue() :" +  now.getMonthValue());
        System.out.println("now.getDayOfMonth() :" +  now.getDayOfMonth());
        System.out.println("now.getDayOfWeek() :" +  now.getDayOfWeek()); //enum 타입(java.time.dayOfWeek)
        System.out.println("now.getDayOfWeek().getValue() :" +  now.getDayOfWeek().getValue());
        System.out.println("now.lengthOfMonth() :"+now.lengthOfMonth());
        System.out.println("now.lengthOfYear() :"+now.lengthOfYear());
        
        LocalDate anyDay = LocalDate.of(1900, 1, 1);
        System.out.println(anyDay);
    }
}
