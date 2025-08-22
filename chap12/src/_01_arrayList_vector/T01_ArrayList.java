package _01_arrayList_vector;

import java.util.ArrayList;

public class T01_ArrayList {
    public static void main(String[] args) {
        //ArrayList vs Vector  비동기화 vs 동기화
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("JDBC");
        list.add("servlet/JSP");
        list.add(2,"Database");
        list.add("iBatis");
        
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.remove(1));
        System.out.println(list.remove("Java"));
        System.out.println(list);
    }
}
