package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMismatchException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        for(int i=1;i<=10;i++) {
            try {
                int n = sc.nextInt();
                sum+=n;
            } catch (InputMismatchException e) {
                i--;
                System.out.println("정수가 아닙니다.");
                sc.next();
            }
        }
        System.out.println("sum="+sum);
    }
}
