package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.Objects;

public class T02_ArrayList2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3.14);
        list.add("5");
        
        Object num = list.get(0);
        int num1 = (int)list.get(0);
        System.out.println(num1);

        int a = (Integer) list.get(0);
    }
}
