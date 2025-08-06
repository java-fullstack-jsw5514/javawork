package _02_for;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.");
        System.out.print("국어 점수 입력: ");
        int language = sc.nextInt();
        System.out.print("영어 점수 입력: ");
        int english = sc.nextInt();
        System.out.print("수학 점수 입력: ");
        int math = sc.nextInt();
        if(language>=40 && english>=40 && math>=40){
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }
        
        System.out.println("2.");
        String id = "id";
        String pw = "pw";
        System.out.print("id 입력: ");
        String idInput = sc.next();
        System.out.print("pw 입력: ");
        String pwInput = sc.next();
        if(id.equals(idInput)){
            if(pw.equals(pwInput)){
                System.out.println("로그인 성공");    
            }
            else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }
        else {
            System.out.println("id가 틀렸습니다.");
        }
        
        System.out.println("3.");
        System.out.print("키(m) 입력: ");
        double height = sc.nextDouble();
        System.out.print("몸무게 입력: ");
        double weight = sc.nextDouble();
        double BMI = weight / (height * height);
        if(BMI >= 18.5){
            System.out.println("저체중");
        }
        else if(BMI < 23){
            System.out.println("정상체중");
        }
        else if(BMI < 25){
            System.out.println("과체중");
        }
        else if(BMI < 30){
            System.out.println("비만");
        }
        else {
            System.out.println("고도비만");
        }
        
        System.out.println("4.");
        System.out.print("중간고사: ");
        int midterm = sc.nextInt();
        System.out.print("기말고사: ");
        int lastterm = sc.nextInt();
        System.out.print("과제: ");
        int homework = sc.nextInt();
        System.out.print("출석: ");
        int present = sc.nextInt();
        double score = (double) midterm *0.2 + (double) lastterm *0.3 + (double) homework *0.3 + (double) present *0.2;
        if(score >=70) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
