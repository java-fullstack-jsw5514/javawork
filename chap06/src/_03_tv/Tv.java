package _03_tv;

public class Tv {
    String company = "LG";
    String model = "울트라 FULL HD";
    int inch = 80;
    boolean power;
    int volume;
    int channel = 5;
    
    void power(){
        power = !power;
    }
    int channelUp() {
        return ++channel;
    }
    int channelDown() {
        return --channel;
    }
    int volume(int newVolume) {
        volume = newVolume;
        return volume;
    }
}
