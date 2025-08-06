package _03_casting;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("(1)");

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("성별을 입력하세요(남/여) : ");
        String gender = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("키을 입력하세요(cm) : ");
        double height = sc.nextDouble();
        sc.nextLine();
        
        System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^\n", height, age, gender, name);
        
        
        System.out.println("(2)");
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        
        System.out.printf("더하기 결과 : %d\n", first+second);
        System.out.printf("빼기 결과 : %d\n", first-second);
        System.out.printf("곱하기 결과 : %d\n", second*first);
        System.out.printf("나누기 몫 결과 : %d\n", first/second);


        System.out.println("(3)");
        System.out.print("가로 길이 : ");
        double vertical = sc.nextDouble();
        System.out.print("세로 길이 : ");
        double horizontal = sc.nextDouble();
        
        System.out.printf("면적: %f\n둘레: %f\n", vertical*horizontal, (vertical+horizontal)*2);
        sc.nextLine();
        
        System.out.println("(4)");
        System.out.print("영어 문자열 입력 : ");
        String str = sc.nextLine();
        for(int i = 0; i<3; i++){
            System.out.print((i+1)+"번째 문자: "+str.charAt(i));
        }
    }
}
