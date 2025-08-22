package _02_phone;

public class Phone {
    String model;
    String color;
    private String message;

    Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    
    void ring(){
        System.out.println("벨이 울립니다.");
    }

    public void hangUp() {
        System.out.println("전화를 받습니다");
    }
    void sendVoice(){
        System.out.println("나: " + message);
    }
}
