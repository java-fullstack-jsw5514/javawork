package ex2.first;

public class Lecture implements Comparable<Lecture>{
    private String name;
    private int price;
    public Lecture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Lecture o) {
        return Integer.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "[강좌명: " + name + ", 가격: " + price + "]";
    }
}
