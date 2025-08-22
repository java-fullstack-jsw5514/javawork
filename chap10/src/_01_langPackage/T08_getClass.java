package _01_langPackage;

class Card2 extends Card {
    Card2(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }
}
public class T08_getClass {
    public static void main(String[] args) {
        Card2 card1 = new Card2("SPADE",2);
        System.out.println(card1);
        
        System.out.println(card1.getClass());
        String asdf = new String();
    }
}
