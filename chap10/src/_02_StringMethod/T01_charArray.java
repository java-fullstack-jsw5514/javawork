package _02_StringMethod;

public class T01_charArray {
    public static void main(String[] args) {
        String str1 = new String("java program");
        String str2 = "another";
        
        char[] chArr = {'컴','퓨','터'};
        String str3 = new String(chArr);
        System.out.println(str3);
        
        String pNum = "123456-1234567";
        System.out.println((pNum.charAt(7)=='1'||pNum.charAt(7)=='3')?"남자":"여자");
    }
}
