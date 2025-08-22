package _04_TreeSet;

import java.util.Random;
import java.util.TreeSet;

public class T01_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> lotto = new TreeSet<>();
        Random rand = new Random();
        while(lotto.size()<6){
            lotto.add(rand.nextInt(45));
        }
        System.out.println(lotto);
    }
}
