package _11_staticEx;

public class Document {
    private String title;
    public static int index = 0;
    public Document() {
        this("제목없음" + ++index);
    }
    public Document(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}
