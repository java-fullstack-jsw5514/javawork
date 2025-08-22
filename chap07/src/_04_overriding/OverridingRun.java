package _04_overriding;

class Over {
    void show(String str){
        System.out.println("부모클래스 메소드 : " + str);
    }
}
class OverChild extends Over {
    @Override
    void show(String str){
        System.out.println("자식클래스 메소드 : " + str);
    }
}
public class OverridingRun {
    public static void main(String[] args) {
        OverChild oc = new OverChild();
        oc.show("자바 프로그래밍");
    }
}
