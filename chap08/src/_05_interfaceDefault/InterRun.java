package _05_interfaceDefault;

public class InterRun {
    public static void main(String[] args) {
        InterClass ic = new InterClass();
        System.out.println(ic.method());
        System.out.println(ic.method1());
        System.out.println(ic.method2());
        
        System.out.println("오버라이딩 안한 deMe() : " + ic.deMe());
        System.out.println("오버라이딩 안한 me() : " + ic.me());
        System.out.println("오버라이딩 안한 stMe() : " + Inter1.stMe());
        
        InterClass2 ic2 = new InterClass2();
        System.out.println("오버라이딩 한  deMe() : "+ic2.method());
        System.out.println("오버라이딩 한 me() : " +  ic2.me());
        System.out.println("오버라이딩 한 deMe()" + ic2.deMe());
    }
}
