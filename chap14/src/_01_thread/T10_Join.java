package _01_thread;

class SumThread extends Thread{
    private int sum;
    
    @Override
    public void run(){
        T10_Join.sleep(2000);
        for(int i=1;i<=1000;i++){
            sum+=i;
        }
        System.out.println("종료");
    }
    public int getSum(){
        return sum;
    }
}
public class T10_Join {
    public static void main(String[] args) {
        SumThread t1 = new SumThread();
        t1.start();
        //join() t1의 run이 끝날때까지 대기
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getSum());
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
