package _01_arrayList_vector;

import java.util.LinkedList;

public class T06_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(0,1);
        list.addFirst(2);
        list.addLast(20);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list);
        
        list.remove(); //removeFirst와 같음
        System.out.println(list);
        
        list.removeFirst();
        System.out.println(list);
        
        list.removeLast();
        System.out.println(list);
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
