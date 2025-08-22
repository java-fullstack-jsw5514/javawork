package _03_StringBuffer;

import java.util.ArrayList;

public class T01_StringBuffer {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        StringBuilder sb3 =  new StringBuilder("Java Program");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        sb3.append("abcdef");
        for (StringBuilder sb : list) {
            System.out.println("길이: "+sb.length());
            System.out.println("용량: "+sb.capacity());
            System.out.println("내용: " + sb);
        }
        System.out.println(sb3.equals(new StringBuilder("Java Program")));
        sb3.append(true);
        sb3.delete(3,6);
        System.out.println(sb3.toString());
        sb3.delete(3,sb3.length());
        System.out.println(sb3.toString()); //Jav
        sb3.insert(1,sb3);
        System.out.println(sb3.toString());
        
        System.out.println(sb3.reverse());
    }
}
