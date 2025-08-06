package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("이름 : "+name);
        
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("나이 : "+age);
        
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("키 : "+height);
        
        System.out.println("Are you a girl?(true/false)?");
        boolean gender = sc.nextBoolean();
        System.out.println("여성인지 여부 : "+ gender);
        
        sc.nextLine();
        
        System.out.println("Enter address : ");
        String address = sc.nextLine();
        System.out.println("주소 : "+address);
        
        System.out.println("Enter your gender(남/여): ");
        char gender2 = sc.next().charAt(0);
        System.out.println("성별 : "+gender2);
    }
}
