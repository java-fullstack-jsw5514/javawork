package _03_StringBuffer;

import static util.MyPrint.println;

public class T03_Math {
    public static void main(String[] args) {
        println("Math.abs(-123): "+Math.abs(-123));
        println("Math.ceil(1.14): "+Math.ceil(1.14));
        println("Math.floor(1.14): "+Math.floor(1.14));
        println("Math.round(1.14): "+Math.round(1.14));
        println("Math.rint(1.14): "+Math.rint(1.14));
        
        double value = 12.34567;
        double value2 = value*100;
        System.out.println("Math.round(value2): "+Math.round(value2));
        
        System.out.println("Math.max(1,4): " + Math.max(1,4));
        System.out.println("Math.min(1,4): " + Math.min(1,4));
        
        System.out.println("Math.pow(5,3): "+Math.pow(5,3));
        
        
    }
}
