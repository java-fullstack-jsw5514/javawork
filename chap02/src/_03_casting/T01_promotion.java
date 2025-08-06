package _03_casting;

public class T01_promotion {
    public static void main(String[] args) {
        byte b1 = 20;
        short s1 = 20;
        int int1 = b1;
        int1 = s1;
        
        char ch1 = '김';
        int intch = ch1;
        
        System.out.println(ch1);
        System.out.println(intch);
        
        int int2 = s1 + 1;
        
    }
}
