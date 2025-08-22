package _02_set;

import java.util.*;

public class T04_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Random rand = new Random();
//        for(int i=1; i<=6; i++){
//            set.add(rand.nextInt(45));
//            if(set.size()<i) i--;
//        }
        
        while (set.size()<6){
            set.add(rand.nextInt(45));
        }
        System.out.println(set);
        
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
