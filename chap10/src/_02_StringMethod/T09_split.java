package _02_StringMethod;

import java.util.Arrays;

public class T09_split {
    public static void main(String[] args) {
        String str = "더조은-홍길동-이순신-아무개";
        for (String s : str.split("-")) {
            System.out.println("반환된 값: " + s);
        }
        System.out.println(Arrays.toString(str.split("-")));
        
        String str2 = "더조은-홍길동/이순신,아무개@서민구";
        System.out.println(Arrays.toString(str2.split("[-/,@]")));
        
        //두번째 인자 = 결과 배열의 길이(몇개로 나눌지)
        System.out.println(Arrays.toString(str2.split("[-/,@]",3)));
    }
}
