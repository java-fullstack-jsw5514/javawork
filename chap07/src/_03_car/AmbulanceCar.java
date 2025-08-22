package _03_car;

public class AmbulanceCar extends Car {
    boolean siren = false;
    
    AmbulanceCar(String model, String company) {
        super(model, company);
    }
    public void siren(){
        siren = true;
        System.out.println("사이렌을 울립니다.");
        siren = false;
    }
    public void firstAid(){
        System.out.println("응급처치를 합니다.");
    }
}
