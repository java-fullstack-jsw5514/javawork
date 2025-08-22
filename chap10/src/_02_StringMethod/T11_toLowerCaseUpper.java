package _02_StringMethod;

import java.util.Scanner;

import static util.MyPrint.print;
import static util.MyPrint.println;

public class T11_toLowerCaseUpper {
    public static void main(String[] args) {
        String str = "Java Program";
        String lowerCase = str.toLowerCase();
        println(lowerCase);
        println(str.toUpperCase());
        
        Scanner sc = new Scanner(System.in);
        print("찾을 문자 입력:");
        String input = sc.next().toLowerCase();
        println(lowerCase.contains(input)?"포함되어 있음":"포함되어 있지않음");
    }
}
