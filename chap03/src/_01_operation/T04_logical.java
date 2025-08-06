package _01_operation;

public class T04_logical {
    public static void main(String[] args) {
        // 논리곱과 논리합
        /*
            x y 논리곱(&&)  논리합(||)
            0 0     0          0
            0 1     0          1
            1 1     1          1
         */
        int num1 = 10;
        int num2 = 20;
        
        
        char ch1 = 'K';
        
        System.out.println(ch1);
        System.out.println("대문자 인가 ? " + (ch1>='A' && ch1<='Z'));
        System.out.println("소문자 인가 ? " + (ch1>='a' && ch1<='z'));
    }
}
