package _02_for;

public class T03_while {
    public static void main(String[] args) {
        //for 문을 while 문으로 바꾸기
        System.out.println("-----for-----------");
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        
        System.out.println("-----while----------");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
}
