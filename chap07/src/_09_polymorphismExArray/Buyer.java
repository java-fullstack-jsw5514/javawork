package _09_polymorphismExArray;

public class Buyer {
    int money = 500;
    int bonusPoint;
    Product[] cart =  new Product[10];
    int index = 0;
    
    void buy(Product product) {
        System.out.println(product +"를 삽니다.");
        if (money >= product.price) {
            money -= product.price;
            bonusPoint += product.bonusPoint;
            cart [index++] = product;
            System.out.println("구매 성공!");
        }
        else {
            System.out.println("돈이 부족합니다.");
        }
    }
    void info() {
        int sum = 0;
        String list = "";
        for (int i = 0; i < index; i++) {
            sum += cart[i].price;
            list += cart[i];
            if(i!=index-1) {
                list+= ", ";
            }
        }
        System.out.println(sum+"개 항목, 목록: "+list);
    }
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        //buyer.money = Integer.MAX_VALUE;
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Game());
        buyer.buy(new Game());
        buyer.info();
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "bonusPoint=" + bonusPoint +
                ", money=" + money +
                '}';
    }
}
