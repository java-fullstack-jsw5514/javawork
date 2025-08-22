package _04_TreeSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class T02_TreeSet {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        
        TreeSet<Integer> set = new TreeSet<>();
        for(Integer i:arr){
            set.add(i);
        }
        System.out.println(set);

        //순서가 있는 set 인터페이스
        //탐색 및 정렬을 위한 다양한 추가 메서드 제공
        //TreeSet은 구현함
        NavigableSet<Integer> desending = set.descendingSet();
        System.out.println(desending);
        
        Integer[] scores = new Integer[]{100, 12, 64, 97, 88, 45};
        TreeSet<Integer> scoreSet = new TreeSet<>();
        for(Integer i:scores){
            scoreSet.add(i);
        }
        
        //inclusive는 자기자신을 포함할지 여부, headSet에서는 false가 기본값, tailSet에서는 true가 기본값
        System.out.println("88점 미만인 점수 검색"+scoreSet.headSet(88,true));
        System.out.println("88점 이상인 점수 검색"+scoreSet.tailSet(88));
    }
}
