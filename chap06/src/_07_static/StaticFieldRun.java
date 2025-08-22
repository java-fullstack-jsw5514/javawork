package _07_static;

public class StaticFieldRun {
    public static void main(String[] args) {
        System.out.println(StaticField.stNum);
        
        StaticField sf = new StaticField();
        System.out.println(sf.stNum);
        System.out.println(sf.stName);
        
        StaticField.staticMethod();
    }
}
