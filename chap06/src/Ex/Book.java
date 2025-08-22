package Ex;

public class Book {
    String name;
    String ISBN;
    int price;
    
    public Book(){
        this("이름 없는 책", "no ISBN", 1000);
    }
    public Book(String name){
        this(name, "no ISBN", 1000);
    }
    public Book(String name, int price){
        this(name, "no ISBN", price);
    }
    public Book(String name, String ISBN, int price) {
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
    }
    public void info() {
        System.out.println("--------------------");
        System.out.println("name: " + name);
        System.out.println("ISBN: " + ISBN);
        System.out.println("price: " + price);
    }
}
