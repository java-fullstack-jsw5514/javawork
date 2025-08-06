package _01_operation;

import java.util.Scanner;

public class T05_threeOp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;

        String result = num1 < num2 ? "num1이 더 작다" : "num1이 더 크다";
        System.out.println(result);

        char result2 = num1 < num2 ? '소' : '대';
        System.out.println(result2);
        
        int num3 = -5;
        int result3 = num3 > 0 ? num3 : -num3;
        System.out.println(result3);

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = sc.nextInt();
        System.out.println(score >= 80 ? "합격" : "불합격");
    }
}
