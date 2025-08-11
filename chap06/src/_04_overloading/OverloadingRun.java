package _04_overloading;

public class OverloadingRun {
    public static void main(String[] args) {
        Overloading over = new Overloading();
        System.out.println(over.add());
        System.out.println(over.add(1));
        System.out.println(over.add(1,2));
        System.out.println(over.add("가나","다라"));
        
        OverOp op = new OverOp();
        System.out.println(op.sub());
        System.out.println(op.sub(1));
        System.out.println(op.sub(1,2));
        System.out.println(op.mul());
        System.out.println(op.mul(1));
        System.out.println(op.mul(1,2));
        System.out.println(op.dev());
        System.out.println(op.dev(1));
        System.out.println(op.dev(1,2));
    }
}
