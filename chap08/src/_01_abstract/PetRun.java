package _01_abstract;

import java.util.ArrayList;

public class PetRun {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Dog());
        pets.add(new Frog());
        pets.add(new Cat("소코티시폴드", "회색", "억울하게 생김"));
        
        for (Pet p : pets) {
            System.out.println("---------------------------");
            System.out.print("울음소리: ");
            p.sound();
            System.out.println("종류: " +  p.getKind());
            System.out.println("색상: " + p.getColor());
            System.out.println("특징: " + p.getFeature());
            System.out.println("---------------------------");
        }
    }
}
