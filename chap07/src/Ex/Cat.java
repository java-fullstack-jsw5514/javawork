package Ex;

public class Cat extends Pet{
    public Cat() {
        super("삼색고양이","삼색","암컷");
    }
    public Cat(String kind, String color, String feature) {
        super(kind, color, feature);
    }
    @Override
    public void sound(){
        System.out.println("야옹");
    }
}
