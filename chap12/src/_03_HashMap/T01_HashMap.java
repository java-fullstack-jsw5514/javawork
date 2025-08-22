package _03_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T01_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("아무개",97);
        map.put("더조은",100);
        map.put("홍길동",86);
        map.put("아더워",78);
        
        System.out.println(map);
        
        Set<String> keys = map.keySet();
        System.out.println(keys);
        
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("key:"+key+",value:"+map.get(key));
        }
    }
}
