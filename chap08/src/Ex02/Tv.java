package Ex02;

public class Tv implements Product {
    boolean power;
    private int volume;
    private int channel;

    @Override
    public void power() {
        power = !power;
    }

    @Override
    public void volume(int volume) {
        this.volume = volume;
    }
    
    public void channel(int channel) {
        this.channel = channel;
    }

    @Override
    public void search(String modifier) {
        System.out.println(modifier+" found in here");
    }
}
