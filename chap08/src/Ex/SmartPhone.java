package Ex;

public class SmartPhone extends Phone{
    public SmartPhone(String owner) {
        super(owner);
    }

    @Override
    void hangUp() {
        System.out.println("SmartPhone hang up");    
    }

    @Override
    void hangOut() {
        System.out.println("SmartPhone hang out");
    }

    @Override
    public String toString() {
        return "smart phone "+ super.toString();
    }
}
