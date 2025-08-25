package _07_CompareTo;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            //return c1.compareTo(c2); //오름차순
            return c2.compareTo(c1); //내림차순
        }
        return 0;
    }
}
public class T02_CompareTo {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
