package _02_for;

public class T07_for_multiple_variable {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = num2 = num3 = 10;
        
        int num4 = 10, num5 = 20, num6 = 30;
        
        for (int i = 1, j=20; i <= 10; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
        
        for(;;){
            System.out.println(num1++);
            if(num1 ==15)
                break;
        }
        
        int num = 0;
        int count = 0;
        while(count < 10) {
            while (num < 98) {
                num = (int) (Math.random() * 100);
                System.out.println(num);
            }
            System.out.println("끝!--------------------------------------");
            num=0;
            count++;
        }
    }
}
