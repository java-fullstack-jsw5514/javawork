package _01_conditional;

public class T04_nested_if {
    public static void main(String[] args) {
        int num1 = 105;
        
        if (num1 > 100) {
            if (num1>200) {
                System.out.println("num1 is greater than 200");
            }
            else {
                System.out.println("num1 is greater than 100 and less than 200");
            }
        }
        else {
            if (num1>0) {
                System.out.println("num1 is less than 100 and more than 0");
            }
            else if (num1==0) {
                System.out.println("num1 is 0");
            }
            else {
                System.out.println("num1 is less than 0");
            }
        }
    }
}
