package Ex02;

public interface Product {
    void power();
    void volume(int volume);
    static void talkToAI(String message) {
        System.out.println("me: "+message);
        System.out.println("AI: Good!");
    }
    default void search(String modifier) {
        System.out.println("Can not find " + modifier);
    }
}
