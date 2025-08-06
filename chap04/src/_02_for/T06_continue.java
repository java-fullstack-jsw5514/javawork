package _02_for;

public class T06_continue {
    public static void main(String[] args) {
        // 1~100까지의 숫자 중 3의 배수를 제외한 합계 구하기
        
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) 
                continue;
            sum += i;
        }
        System.out.println(sum);
    }
}
