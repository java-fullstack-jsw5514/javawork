package _08_polymorphismEx;

public class Product {
    int price;
    int bonusPoint;
    
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(0.05 * price);
    }
}
