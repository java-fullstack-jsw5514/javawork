package _03_casting;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first character: ");
        char character = sc.next().charAt(0);
        System.out.printf("character is %d\n", (int)character);
        
        System.out.println("Enter the language score: ");
        int langScore = sc.nextInt();
        System.out.println("Enter the english score: ");
        int engScore = sc.nextInt();
        System.out.println("Enter the mathematical score: ");
        int mathScore = sc.nextInt();
        int sum = langScore + engScore + mathScore;
        System.out.println("The sum is " + sum);
        double avg = (double) sum / 3f;
        System.out.printf("The average is %.2f", avg);
        System.out.println();

        //3
        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'K';
        
        System.out.print("3.1. ");
        System.out.println(iNum1/iNum2);
        
        System.out.print("3.2. ");
        double result1 = iNum2 * dNum;
        System.out.println(result1);
        
        System.out.print("3.3. ");
        System.out.printf("%.1f", (double)iNum1);
        System.out.println();
        
        System.out.print("3.4. ");
        System.out.printf("%f", (double)iNum1/(double)iNum2);
        System.out.println();
        
        System.out.print("3.5. ");
        System.out.print(iNum1/(int) fNum);
        System.out.println();
        
        System.out.print("3.6. ");
        System.out.printf("%.13f", iNum1 / (double)fNum);
        System.out.println();
        
        System.out.print("3.7. ");
        System.out.println((int)ch);
        
        System.out.print("3.8. ");
        System.out.println((char) ((int)ch+1));
    }
}
