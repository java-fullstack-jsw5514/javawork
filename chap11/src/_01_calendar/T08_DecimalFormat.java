package _01_calendar;

import java.text.DecimalFormat;

public class T08_DecimalFormat {
    public static void main(String[] args) {
        double num1 = 1234567.89;
        double num2 = 2.0;

        //0은 값이 없어도 0으로 채움
        //#은 값이 없으면 자리 차지 안함
        DecimalFormat df = new DecimalFormat("0.0#");
        System.out.println(df.format(num1));
        System.out.println(new DecimalFormat("#####.0#####").format(num2));
    }
}
