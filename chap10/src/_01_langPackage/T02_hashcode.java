package _01_langPackage;

import java.util.Objects;

class Equals {
    int value;
    
    Equals(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Equals && this.value == ((Equals) obj).value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
public class T02_hashcode {
    public static void main(String[] args) {
        Equals e1 = new Equals(10);
        Equals e2 = new Equals(10);
        
        System.out.println("e1.hashCode() : "+e1.hashCode());
        System.out.println("e2.hashCode() : "+e2.hashCode());
        System.out.println("System.identityHashCode(e1) : "+System.identityHashCode(e1));
        System.out.println("System.identityHashCode(e2) : "+System.identityHashCode(e2));
    }
}
