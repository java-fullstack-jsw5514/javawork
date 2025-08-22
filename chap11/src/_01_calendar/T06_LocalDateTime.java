package _01_calendar;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        LocalDateTime startDay = LocalDateTime.of(2025,8,4,15,0,0);
        LocalDateTime endDay = LocalDateTime.of(2026,3,13,22,20,0);
        System.out.println(startDay);
        System.out.println(endDay);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("start day: "+formatter.format(startDay));
        System.out.println("end day: "+formatter.format(endDay));
        System.out.println("-----------------------");
        
        if(now.isBefore(endDay)) {
            System.out.println("수업 진행중 입니다.");
        } else if (now.isAfter(endDay)) {
            System.out.println("종료된 수업입니다.");
        } else if (now.isEqual(endDay)) {
            System.out.println("수업 마지막날 입니다.");
        }
        
        Duration duration =  Duration.between(startDay,endDay);
        System.out.println(duration.getSeconds());

        System.out.println("종료일까지 "+now.until(endDay, ChronoUnit.MONTHS)+"개월 남음");
        System.out.println("종료일까지 "+now.until(endDay, ChronoUnit.DAYS)+"일 남음");
        System.out.println("종료일까지 "+now.until(endDay, ChronoUnit.HOURS)+"시간 남음");
        
        System.out.println(now.plusDays(3)); // 3일이 추가된 복사본 리턴(새 객체 생성) 
    }
}
