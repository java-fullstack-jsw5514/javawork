package _01_operation;

public class T02_increase {
    public static void main(String[] args) {
        int num1;
        num1 = 10;
        ++num1;

        //연산시
        int num2 = 10;
        int num3 = 10;

        // 앞에 붙으면 먼저 증가시키고 연산을 하고,
        // 뒤에 붙으면 연산 먼저하고 다음에 나 자신을 증가시킨다.
        int result = ++num2 + num3++;
        System.out.println(result);
        System.out.println(num2);
        System.out.println(num3);
        
        num2 = num3 = 10;
    }
}
