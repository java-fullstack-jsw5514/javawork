package _01_exception;

import java.util.Scanner;

public class T08_arithmetic {
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
    }
}
