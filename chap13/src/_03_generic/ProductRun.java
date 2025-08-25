package _03_generic;

public class ProductRun {
    public static void main(String[] args) {
        Product<Tv,String> p1 = new Product<>();
        p1.setKind(new Tv());
        p1.setModel("스마트 TV");
        
        Tv tv = p1.getKind();
        String model = p1.getModel();
        System.out.println(p1);
    }
}
