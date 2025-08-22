package _02_StringMethod;

public class T07_lastIndexOf {
    public static void main(String[] args) {
        //뒤에서부터 탐색
        String str = "springjavahtml";
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a",6));
    }
}
