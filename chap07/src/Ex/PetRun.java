package Ex;

import java.util.ArrayList;

public class PetRun {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Dog());
        pets.add(new Frog());
        for (Pet p : pets) {
            p.info();
            p.sound();
        }
    }
}
