package _02_phone;

public class SmartPhone extends Phone{
    SmartPhone(String model, String color) {
        super(model, color);
    }
    
    String search;
    
    String setSearch(String search) {
        this.search = search;
        return search;
    }
}
