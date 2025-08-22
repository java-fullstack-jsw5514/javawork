package _03_car;

public class Car {
    String model;
    String company;
    boolean power;
    int speed;
    
    Car(String model, String company) {
        this.model = model;
        this.company = company;
    }
    void stop() {
        speed = 0;
        power = false;
    }
    void speedUp() {
        if (power) {
            speed++;
        }
    }
    void speedDown() {
        if (power) {
            speed--;
        }
    }
}
