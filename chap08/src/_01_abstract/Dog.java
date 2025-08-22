package _01_abstract;

public class Dog extends Pet{
    Dog(){
        super("진돗개","흰색","조용함");
    }
    Dog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    void sound() {
        System.out.println("멍멍");
    }

    @Override
    void info() {
        System.out.println("종류: " + getKind());
    }
}
