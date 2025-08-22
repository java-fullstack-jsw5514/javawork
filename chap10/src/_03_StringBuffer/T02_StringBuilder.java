package _03_StringBuffer;

public class T02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("java").append(" programming");
        System.out.println(sb.toString());
        
        sb.insert(4," java");
        System.out.println(sb.toString());
    }
}
