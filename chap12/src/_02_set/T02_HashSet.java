package _02_set;

import java.util.Arrays;
import java.util.HashSet;

public class T02_HashSet {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(nums[1]);
        
        System.out.println(set1);
        
        Object[] objArr = {"1",Integer.valueOf(1),"2","2","3","3","4","4","4"};
        HashSet<Object> set2 = new HashSet<>();
        for(Object obj : objArr){
            set2.add(obj);
        } //set2.addAll(Arrays.asList(objArr)); // 같은 코드
        System.out.println(set2);
        
        HashSet<String> set3 = new HashSet<>();
        set3.add("java");
        set3.add("JDBC");
        set3.add("servlet");
        set3.add("oracle");
        set3.add("java");
        
        System.out.println("size of set3 : " + set3.size());
        System.out.println("set3 : " + set3);
        
        set3.clear();
        if(set3.isEmpty()){
            System.out.println("set3 is empty");
        }
        else {
            System.out.println("set3 is not empty");
        }
    }
}
