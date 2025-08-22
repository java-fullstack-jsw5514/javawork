package Ex02;

import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Tv());
        products.add(new Game());
        Product.talkToAI("hi");
        for (Product p : products) {
            p.power();
            p.volume(10);
            if(p instanceof Tv){
                ((Tv) p).channel(10);
            }
            else if(p instanceof Game){
                ((Game) p).changeGame("테트리스");
            }
            p.search("something");
        }
    }
}
