package _07_Polymorphism;

class A { int a=1; }
class B extends A { int b=2; }
class C extends A { int c=3; }
class D extends B { int d=4; }
class E extends C { int e=5;}
public class T01_Polymorphism {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;
        
        System.out.println("b.a = " + b.a);
        System.out.println("b.b = " + b.b);
        System.out.println("a1.a = " + a1.a);
        System.out.println("a3.a = " + a3.a);
    }
}
