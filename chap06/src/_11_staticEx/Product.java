package _11_staticEx;

public class Product {
    private String productId;
    public static int quantity = 0;
    public Product() {
        productId = "더조은" + ++quantity;
    }
}
