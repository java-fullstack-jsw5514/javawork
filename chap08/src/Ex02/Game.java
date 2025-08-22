package Ex02;

public class Game implements Product{
    private boolean power;
    private int volume;
    private String game;

    @Override
    public void power() {
        power = !power;
    }

    @Override
    public void volume(int volume) {
        this.volume = volume;
    }
    
    public void changeGame(String newGame) {
        game = newGame;
    }
}
