package _01_thread;

class ThreadA extends Thread{
    boolean stop = false;
    boolean work = true;
    @Override
    public void run() {
        while(!stop){
            if(work){
                System.out.println("ThreadA 작업 실행");
            }
            else{
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
class ThreadB extends Thread{
    boolean stop = false;
    boolean work = true;
    @Override
    public void run() {
        while(!stop){
            if(work){
                System.out.println("ThreadB 작업 실행");
            }
            else{
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }
}
public class T09_Yield {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        ta.start();
        tb.start();
        
        sleep(3000);
        ta.work = false;
        sleep(500);
        ta.work = true;
        sleep(500);
        ta.stop = true;
        tb.stop = true;
    }
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
