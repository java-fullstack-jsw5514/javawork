package _07_static;

public class StaticField {
    int num = 3;
    String name = "인스턴스 필드";
    
    static int stNum = 10;
    static String stName = "정적 필드";
    
    void method() {
        System.out.println("instance method");
        System.out.println("num = " + num);
        System.out.println("stNum = " + stNum);
    }
    
    static void staticMethod() {
        System.out.println("static method");
        System.out.println("stNum = " + stNum);
        System.out.println("stName = " + stName);
    }
}
