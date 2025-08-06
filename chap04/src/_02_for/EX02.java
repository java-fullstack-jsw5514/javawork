package _02_for;

public class EX02 {
    public static void main(String[] args) {
        System.out.println("1.");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("5의 배수의 합계는 "+sum);
        
        System.out.println("2.");
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }
        System.out.println("짝수의 합계는 " + evenSum);
        System.out.println("홀수의 합계는 " + oddSum);
        
        System.out.println("3.");
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                if(i+j==6)
                    System.out.println("i="+i+",j="+j);
            }
        }
        
        System.out.println("4.");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(i>=j)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println("5.");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(i<=j)
                    System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("6.");
        for(int i = 0; i < 5; i++){
            for(int j = 1; j <= 9; j++){
                if(5-i<=j && 5+i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println("7.");
        int eye = 0;
        int count = 0;
        while(eye!=6){
            eye = (int)(Math.random()*6)+1;
            System.out.println("{"+eye+"}");
            count++;
        }
        System.out.println("총 주사위 굴린 횟수는 : "+count+"회");
    }
}
