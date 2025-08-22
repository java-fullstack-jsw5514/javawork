package _02_interface;

public class InterRun {
    public static void main(String[] args) {
        InterClass in = new InterClass();
        in.print(1);
        in.method();
        System.out.println(in.str("a"));
        System.out.println(in.PI);
        
        System.out.println(in.add(1,2));
    }
}
