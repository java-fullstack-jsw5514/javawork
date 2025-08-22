package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T09_multicatch {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        try{
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
            e.printStackTrace();
        }
        catch(InputMismatchException e) {
            System.out.println("input error");
            e.printStackTrace();
        }
    }
}
