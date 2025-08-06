package _01_conditional;

import java.util.Scanner;

public class T03_multi_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your score");
        int score = sc.nextInt();
        
        if (score > 100) {
            System.out.println("No score can be more than 100");
        } else if (score >= 90) {
            System.out.println("Your grade is A");
        }
        else if (score >= 80) {
            System.out.println("Your grade is B");
        }
    }
}
