package _03_HashMap;

import java.util.HashMap;

public class SnackRun {
    public static void main(String[] args) {
        HashMap<String,Snack> map=new HashMap<String,Snack>();

        map.put("새우깡",new Snack("짠맛",500));
        map.put("포테이토칩",new Snack("짠맛",500));
        map.put("칸초",new Snack("단맛",800));
        map.put("다이제스트",new Snack("초코맛",1000));
        
        System.out.println(map);
        
        map.put("새우깡",new Snack("매운맛",700));
        System.out.println(map);
        
        System.out.println(map.get("다이제스트"));
        
        System.out.println(map.size());
        
        map.replace("포테이토칩",new Snack("잔맛",1000));
        System.out.println(map);
        
        for(String key:map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
}
