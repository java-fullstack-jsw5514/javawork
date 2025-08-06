package _01_conditional;

import java.util.Scanner;

public class T02_if_else {
    public static void main(String[] args) {
        /*
        if(조건식){
            참일때 실행할 구문
        }
        else {
            거짓일때 실행할 구문
        }
         */
        
        int score = 97;
        if(score >= 70) {
            System.out.println("합격입니다");
            System.out.println("축하합니다");
        }
        else {
            System.out.println("불합격입니다.");
            System.out.println("다음 기회에!!!");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number%2==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
