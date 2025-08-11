package _04_enum;

import java.util.Calendar;

public class T01_enumNEWS {
    public enum Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, NOVEMBER, DECEMBER;
    }
    public static void main(String[] args) {
        NEWS news1 = NEWS.EAST;
        System.out.println(news1);
        
        NEWS news2 = NEWS.valueOf("WEST");
        System.out.println(news2);
        
        NEWS news3 = NEWS.valueOf(NEWS.class, "SOUTH");
        System.out.println(news3);
        
        System.out.println("---------------------------------");
        Calendar calendar = Calendar.getInstance();
        int weekNum = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(weekNum);
        
        int monthNum = calendar.get(Calendar.MONTH);
        Month month = Month.values()[monthNum];
        switch (month) {
            case JANUARY:
                System.out.println("January");
                break;
            case FEBRUARY:
                System.out.println("February");
                break;
            case MARCH:
                System.out.println("March");
                break;
            case APRIL:
                System.out.println("April");
                break;
            case MAY:
                System.out.println("May");
                break;
            case JUNE:
                System.out.println("June");
                break;
            case JULY:
                System.out.println("July");
                break;
            case AUGUST:
                System.out.println("August");
                break;
            case SEPTEMBER:
                System.out.println("September");
                break;
            case NOVEMBER:
                System.out.println("November");
                break;
            case DECEMBER:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
