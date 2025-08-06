package _02_for;

public class T08_random {
    public static void main(String[] args) {
        double rand1 = Math.random();
        System.out.println(rand1);
        System.out.println("-----------------------------------------");
        
        double rand2 = Math.random();
        System.out.println(rand2);
        System.out.println("-----------------------------------------");
        
        int intRand = (int) (Math.random()*10);
        System.out.println(intRand);
        System.out.println("-----------------------------------------");
        
        int intRand2 = (int)(Math.random()*10)+1;
        System.out.println(intRand2);
        System.out.println("----------------------------------------");
        
        int intRand3 = ((int)(Math.random()*10)%3)+1;
        System.out.println(intRand3);
        System.out.println("---------------------------------------");
    }
}
