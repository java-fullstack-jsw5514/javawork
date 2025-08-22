package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3,2,1);
        List<Integer> list2 = List.of(1,2,3);
        
        List<Integer> list3 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            list3.add(i);
        }
        System.out.println(list3);
        
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    
        ArrayList<String> slist = new ArrayList<>();
        slist.add("B");
        slist.add("C");
        //slist.add(3,"A");
        slist.add(2,"D");
        System.out.println(slist);
        
        ArrayList<String> slist2 = new ArrayList<>();
        slist2.add("A");
        slist2.add("B");
        slist2.add("F");
        slist2.add("Z");
        System.out.println(slist2);
        
        slist.retainAll(slist2); //겹치는 부분만 남기고 삭제
        System.out.println(slist);
    }
}
