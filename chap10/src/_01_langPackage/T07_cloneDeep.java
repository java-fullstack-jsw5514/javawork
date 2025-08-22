package _01_langPackage;

import java.util.Arrays;

public class T07_cloneDeep {
    private static String[] deepCopy(String[] original) {
        String[] copy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = new String(original[i].toCharArray());
        }
        return copy;
    }
    public static void main(String[] args) {
        String[] original = new String[]{"aa","bb","cc"};
        String[] copy = deepCopy(original);
        System.out.println("original == copy : " + (original==copy));
        for(int i = 0; i < original.length; i++){
            System.out.printf("\n%d번째 값 확인\n",i+1);
            System.out.println("original == copy : " + (original[i]==copy[i]));
            System.out.println("original equals copy : " + (original[i].equals(copy[i])));
        }
        System.out.println("================================");
        
        String[] secondCopy = Arrays.copyOf(original, original.length);
        System.out.println("array copy = "+Arrays.toString(secondCopy));
    }
}
