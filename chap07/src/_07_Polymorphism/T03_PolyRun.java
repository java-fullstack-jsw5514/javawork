package _07_Polymorphism;

class Car {
    void drive(){
        System.out.println("car driving");
    }
    void stop(){
        System.out.println("car stop");
    }
}
class FireCar extends Car {
    @Override
    void drive() {
        System.out.println("fire car driving");
    }
    void water() {
        System.out.println("fire car watering");
    }
    @Override
    void stop() {
        System.out.println("fire car stop");
    }
}
public class T03_PolyRun {
    public static void main(String[] args) {
        FireCar fc = new FireCar();
        fc.drive();
        fc.water();
        fc.stop();
        
        Car c = fc;
        c.drive();
        c.stop();
        
        FireCar fc2 = (FireCar) c;
        
        Car c2 = new Car();
        
        FireCar f3 = null;
        if (c2 instanceof FireCar) {
            f3 = (FireCar) c2;
        }
        else{
            System.out.println("변환할 수 없음");
        }
    }
}
