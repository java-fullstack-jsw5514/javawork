package _01_exception;

public class T01_exception {
    public static void main(String[] args) {
        try {
            throw new Exception("asdf");
        }
        catch (Exception e) {
            System.out.println("ClassCastException");
        }
    }
}
