public class T01_variable {
    public static void main(String[] args) {
        /*
         * 기본 자료형
         * 정수: int(4byte)
         * 실수: double(8byte)
         * 참,거짓: boolean(1byte)
         * 문자1개: char(2byte)
         */
        /* 정수
         * - byte(1byte)
         * - short(2byte)
         * - int(4byte)
         * - long(8byte) :  숫자 뒤에 L자를 붙여줌
         * 
         * 실수
         * - float(4byte) : 숫자 뒤에 f를 붙여줌
         * - double(8byte)
         */
        int num1;
        
        int num2 = 10;
        
        num1 = 20;
        
        System.out.println(num1);
        System.out.println(num2);
        
        System.out.println(num1 + num2);
        System.out.println(num1 * 2 + num2);
        
        int result = num1 * 2 + num2;
        System.out.println(result / 5);
        
        long long01 = 50000000000L;
        
        double dou01 = 39.29384938;
        System.out.println(dou01);
    }
}