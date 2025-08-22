package _08_polymorphismEx;

public class Game extends Product{
    Game() {
        super(300);
    }
    @Override
    public String toString() {
        return "Game";
    }
}
