package Ex;

public class Dog extends Pet{
    public Dog(){
        super("진돗개","흰색","사나움");
    }
    public Dog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
