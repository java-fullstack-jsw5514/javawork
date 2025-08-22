package _05_super;

class Parent3 {
    int x;
    int z;
    Parent3() {
        System.out.println("부모 생성자 호출");
        x = 10;
        z = 30;
    }
}
class Child3 extends Parent3 {
    int x;
    int y;
    Child3() {
        System.out.println("자식 생성자 호출");
        x = 10*10;
        y = 10*10;
    }
}
class GrandChild3 extends Child3 {
    int x;

    GrandChild3() {
        System.out.println("자손 생성자 호출");
        x = 10*10*10;
    }
    void xPrint() {
        System.out.println(super.x);
    }
}
public class T03_superRun3 {
    public static void main(String[] args) {
        GrandChild3 gc = new GrandChild3();
        System.out.println(gc.x);
        System.out.println(gc.y);
        System.out.println(gc.z);
        gc.xPrint();
    }
}
