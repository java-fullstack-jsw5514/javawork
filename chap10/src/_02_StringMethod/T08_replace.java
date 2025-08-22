package _02_StringMethod;

public class T08_replace {
    public static void main(String[] args) {
        String str = "javaprogram java aws java da java";
        System.out.println(str.replace("java","자바"));
        System.out.println(str.replaceAll("java(p+)","자바프")); //정규표현식 사용 가능
        System.out.println(str.replaceFirst("java","자바"));
    }
}
