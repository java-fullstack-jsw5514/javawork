package Ex;

public class stringTest {
    public static void main(String[] args) {
        String s = "𝄞"; // U+1D11E
        System.out.println(s.length()); // 2, char 2개
        String test = "aaaa"+s;
        String asdf = "asdf";
        System.out.println(asdf.indexOf(s));
        System.out.println(test.indexOf(119070));
    }
}
