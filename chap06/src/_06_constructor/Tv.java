package _06_constructor;

public class Tv {
    String company = "LG";
    String model;
    int channel;
    
    public Tv(String company, String model, int channel) {
        this.company = company;
        this.model = model;
        this.channel = channel;
    }
    public Tv(){}
    
    public String toString() {
        return "제조사: " + company + "\n모델명: " + model + "\n채널: " + channel + 
                "\n------------------------------";
    }
}
