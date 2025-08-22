package _05_TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class T01_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 10);
        treeMap.put("orange", 20);
        treeMap.put("pear", 30);
        treeMap.put("grape", 40);
        treeMap.put("kiwi", 50);
        treeMap.put("pineapple", 60);
        
        System.out.println("[c~p사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c",true,"pz", true);
        for(String key:rangeMap.keySet()){
            System.out.println(key+": "+rangeMap.get(key)+"페이지");
        }
    }
}
