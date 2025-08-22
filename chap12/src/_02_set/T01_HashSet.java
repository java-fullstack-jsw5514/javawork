package _02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Hash1{
    private String value;
    public Hash1(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Hash1{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hash1 hash1 = (Hash1) o;
        return Objects.equals(value, hash1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

public class T01_HashSet {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        Set<Hash1> set2 = new HashSet<>();
        
        Hash1 h1 = new Hash1("A");
        set2.add(h1);
        set2.add(new Hash1("B"));
        set2.add(new Hash1("C"));
        set2.add(new Hash1("D"));
        set2.add(new Hash1("E"));
        
        System.out.println("총 객체의 갯수 : " + set2.size());
        System.out.println(set2);
        
        Iterator<Hash1> iterator = set2.iterator();
        while (iterator.hasNext()){
            Hash1 hash1 = iterator.next();
            System.out.println(hash1);
        }
        System.out.println("----------------------------");
        
        printIterator(set2.iterator());
        removeOne(set2,"B");
        printIterator(set2.iterator());
        removeOne(set2,"A");
        printIterator(set2.iterator());
        
    }
    
    //util
    private static void printIterator(Iterator<Hash1> iterator){
        while (iterator.hasNext()){
            Hash1 hash1 = iterator.next();
            System.out.println(hash1);
        }
        System.out.println("----------------------------");
    }
    private static void removeOne(Set<Hash1> set, String value){
        Hash1 input = new Hash1(value);
        for(Iterator<Hash1> it = set.iterator(); it.hasNext();){
            Hash1 hash1 = it.next();
            if(hash1.equals(input)){
                it.remove();
            }
        }
        
        //set.removeIf(hash1 -> hash1.equals(input)); //같은 코드
    }
}
