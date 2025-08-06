package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {
    public static void main(String[] args) {
        // 국어, 컴퓨터, 수학 점수를 사용자로부터 입력받아 저장하고
        // 총점과 평균을 출력하시오
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the language score: ");
        int language = sc.nextInt();
        System.out.print("Enter the computer score: ");
        int computer = sc.nextInt();
        System.out.print("Enter the mathematical score: ");
        int math = sc.nextInt();
        
        int sum = language + computer + math;
        int average = sum / 3;
        System.out.println("The sum of all score is: " + sum);
        System.out.println("The average score is: " + average);
    }
}
