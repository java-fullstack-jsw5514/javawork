package _01_exception;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class T06_classCast {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println((Cat)animal);
    }
}
