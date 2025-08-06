package _03_casting;

public class T02_casting {
    public static void main(String[] args) {
        System.out.println("byte의 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short의 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int의 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("char의 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
    
        int num1 = 255;
        byte b1 = (byte)num1;
        System.out.println("byte 값의 크기 : " + b1);
        
        long long1 = Long.MAX_VALUE;
        float float1 = long1;
        System.out.println("long 값의 크기 : " + float1);
        
        int num2 = 51648;
        char ch1 = (char)num2;
        System.out.println("char 값의 크기 : " + ch1);
    }
}
