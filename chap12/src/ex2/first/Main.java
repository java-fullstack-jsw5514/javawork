package ex2.first;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Lecture> set = new TreeSet<Lecture>();
        set.add(new Lecture("Math",3000));
        set.add(new Lecture("English",5000));
        set.add(new Lecture("Music",2000));
        set.add(new Lecture("Computer",10000));
        
        List list = new ArrayList<>(set);
        Desending com = new Desending();
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,com);
        System.out.println(list);
    }
}
