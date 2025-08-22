package _11_staticEx;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();  // 고유한 제품번호 (더조은1)
        Product p2 = new Product();   // 고유한 제품번호 (더조은2)
        Product p3 = new Product();   // 고유한 제품번호 (더조은3)
        printQuantity();
        Product p4 = new Product();   // 고유한 제품번호 (더조은4)
        Product p5 = new Product();   // 고유한 제품번호 (더조은5)
        printQuantity();
    }
    private static void printQuantity() {
        System.out.println("생산된 총 제품의 갯수 : "+Product.quantity);
    }
}
