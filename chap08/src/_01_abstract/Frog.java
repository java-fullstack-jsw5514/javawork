package _01_abstract;

public class Frog extends Pet{
    Frog(){
        super("청개구리","초록색","말을 안 들음");
    }
    Frog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    void sound() {
        System.out.println("개굴개굴");
    }

    @Override
    void info() {
        System.out.println("종류: " + getKind());
    }

    @Override
    public String toString() {
        return "종류: " + getKind() + ", 색상: " + getColor() + ", 특징:  " + getFeature();
    }
}
