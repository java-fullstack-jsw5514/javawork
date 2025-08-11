package _05_varArg;

public class VarArg {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F"};
        method(arr);
        method("sadf", "sadf", "sadf", "sadf", "sadf", "sadf", "sadf", "sadf", "sadf");
    }
    
    static void method(String... strs) {
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
