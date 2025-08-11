package _02_Array;

public class T06_ArrayFor {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        for(int num : nums) {
            System.out.println(num);
        }
        
        String[] names = {"Jack", "Alice", "Bob"};
        for(String name : names) {
            System.out.println(name);
        }

        int index = 0;
        String[] names2 = new String[3];
        for(String name : names) {
            names2[index++] = name;
            System.out.println(names2[index-1]);
        }
    }
}
