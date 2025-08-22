package _08_polymorphismEx;

public class Buyer {
    int money = 500;
    int bonusPoint;
    
    void buy(Product product) {
        System.out.println(product +"를 삽니다.");
        if (money >= product.price) {
            money -= product.price;
            bonusPoint += product.bonusPoint;
            System.out.println("구매 성공!");
        }
        else {
            System.out.println("돈이 부족합니다.");
        }
    }
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        //buyer.money = Integer.MAX_VALUE;
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Game());
        System.out.println(buyer);
        buyer.buy(new Game());
        System.out.println(buyer);
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "bonusPoint=" + bonusPoint +
                ", money=" + money +
                '}';
    }
}
