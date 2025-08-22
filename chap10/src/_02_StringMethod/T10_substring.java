package _02_StringMethod;

import static util.MyPrint.println;

public class T10_substring {
    public static void main(String[] args) {
        String str = "javaprogram java aws java da java";
        String result = str.substring(7);
        println(result);
        
        result = str.substring(7,10);
        println(result);
        
        String sn = "200304-1234567";
        result = sn.substring(0,6);
        println(result);
        
        StringBuilder builder = new StringBuilder();
        int ageNum = Integer.parseInt(sn.substring(0,2));
        boolean is20 = ageNum<=25;
        int age = is20?25-ageNum:125-ageNum;
        builder.append(is20?"20":"19")
                .append(sn, 0, 2).append("년 ")
                .append(sn, 2, 4).append("월 ")
                .append(sn, 4, 6).append("일");
        println(builder);
        
        println("나이: "+age);
    }
}
