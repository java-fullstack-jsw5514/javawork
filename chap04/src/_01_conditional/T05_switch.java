package _01_conditional;

import java.util.Scanner;

public class T05_switch {
    public static void main(String[] args) {
        int num1 = 2;
        
        switch (num1) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("else");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter operator: ");
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(num2 + num3);
                break;
            case "-":
                System.out.println(num2 - num3);
                break;
            case "*":
                System.out.println(num2 * num3);
                break;
            case "/":
                System.out.println(num2 / num3);
                break;
            case "%":
                System.out.println(num2 % num3);
            default:
                System.out.println("invalid operator");
        }
        
    }
}
