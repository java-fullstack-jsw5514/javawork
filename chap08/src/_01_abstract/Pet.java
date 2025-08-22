package _01_abstract;

public abstract class Pet {
    private String kind;
    private String color;
    private String feature;
    Pet(String kind, String color, String feature) {
        this.kind = kind;
        this.color = color;
        this.feature = feature;
    }
    abstract void sound();
    abstract void info();
    
    String getKind() {
        return kind;
    }
    String getColor() {
        return color;
    }
    String getFeature() {
        return feature;
    }
}
