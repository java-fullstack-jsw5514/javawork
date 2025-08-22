package _02_StringMethod;

public class T03_contains {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "efgh";
        
        System.out.println(str1.contains("abc"));
        System.out.println(str1.contains(str2));
        
        if(str1.contains("abcd")){
            System.out.println("abcd가 들어있음");
        }
    }
}
