package _04_overloading;

public class Overloading {
    int add() {
        return 0;
    }
    int add(int a) {
        return a;
    }
    int add(int a, int b) {
        return a + b;
    }
    String add(String a, String b) {
        return a+b;
    }
}
