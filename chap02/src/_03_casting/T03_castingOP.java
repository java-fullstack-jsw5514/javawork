package _03_casting;

public class T03_castingOP {
    public static void main(String[] args) {
        //int형 보다 작은 자료형의 연산은 모두 int로 자동형변환 됨
        byte b1 = 10;
        byte b2 = 20;
        
        //byte result1 = b1 + b2;
        int result2 = b1 + b2;
        
        char c1 = 'A';
        //char c2 = c1 + 5;
        int c3 = c1 + 5;
        System.out.println(c3);
        
        
    }
}
