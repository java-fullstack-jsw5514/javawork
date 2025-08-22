package _01_exception;

public class T04_ArratIndexOutOfBound {
    public static void main(String[] args) {
        String str[] = new String[]{"asdf","ㅁㅁㅁㅁ","eeeee"};
        str[3]="asdfdd";
    }
}
