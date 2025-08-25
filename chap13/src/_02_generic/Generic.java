package _02_generic;

class Box<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
class Apple {}
class Banana {}
public class Generic {
    public static void main(String[] args) {
        Box<String> box1 =  new Box<>();
        box1.set("string");
        
        Box<Integer> box2 = new Box<>();
        box2.set(1);
        
        Box<Apple> box3 = new Box<>();
        box3.set(new Apple());
    }
}
