package _01_operation;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("(1)");
        int b = sc.nextInt();
        if (b>0){
            System.out.println("positive");
        }
        else{
            System.out.println("not positive");
        }
        
        System.out.println("(2)");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("negative");
        }
        else if(a>0) {
            System.out.println("positive");
        }
        else {
            System.out.println("zero");
        }
        
        System.out.println("(3)");
        int c = sc.nextInt();
        if(c%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
        System.out.println("(4)");
        System.out.print("Enter number of people:");
        int people = sc.nextInt();
        System.out.println("Enter number of candy:");
        int candy = sc.nextInt();
        System.out.println("candy at one person: " + candy/people + " rest of candy:" + candy%people);
        
        System.out.println("(5)");
        System.out.print("name:");
        String name = sc.next();
        System.out.print("grade(number):");
        int grade = sc.nextInt();
        System.out.print("group(number):");
        int group = sc.nextInt();
        System.out.print("personal number:");
        int personal = sc.nextInt();
        System.out.print("gender(M/F):");
        String gender = sc.next();
        System.out.print("score(rounded to two decimal places):");
        double score = sc.nextDouble();
        
        System.out.printf("\n%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.\n",grade,group,personal,name,
                gender.equals("M") ? "남" : "여",score);
        
        System.out.println("(6)");
        System.out.print("age:");
        int age = sc.nextInt();
        System.out.println(
                age<=13 ? "어린이":
                age<=19 ? "청소년":
                "성인");
        
        System.out.println("(7)");
        System.out.print("language score:");
        int languageScore = sc.nextInt();
        System.out.print("English score:");
        int englishScore = sc.nextInt();
        System.out.print("math score:");
        int mathScore = sc.nextInt();
        System.out.println(languageScore >=40 && englishScore >=40 && mathScore >=40 && (languageScore+englishScore+mathScore)/3==60
        ? "합격" : "불합격");
        
        sc.nextLine();
        
        System.out.println("(8)");
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        String personalNum = sc.nextLine();
        if(Integer.parseInt(personalNum.charAt(7)+"")%2==0) {
            System.out.println("woman");
        }
        else{
            System.out.println("man");
        }
        
        System.out.println("(9)");
        System.out.print("Enter first number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number : ");
        int secondNum = sc.nextInt();
        System.out.print("Enter third number : ");
        int thirdNum = sc.nextInt();
        
        if(firstNum>=secondNum){
            System.out.println("error");
        }
        else if(firstNum>thirdNum && secondNum<thirdNum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        System.out.println("(10)");
        System.out.print("Enter first number : ");
        firstNum = sc.nextInt();
        System.out.print("Enter second number : ");
        secondNum = sc.nextInt();
        System.out.print("Enter third number : ");
        thirdNum = sc.nextInt();
        if(firstNum==secondNum && firstNum==thirdNum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
