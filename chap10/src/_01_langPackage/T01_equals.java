package _01_langPackage;

class Value {
    int value;
    Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Value && this.value == ((Value) obj).value;
    }
}
public class T01_equals {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        Value v3 = v1;
        System.out.println(v1.equals(v2)?"v1 is equal v2":"v1 is not equal v2");
        System.out.println(v1.equals(v3)?"v1 is equal v3":"v1 is not equal v3");
    }
}
