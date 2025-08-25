package _01_thread;

class AutoSaveThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("작업파일이 자동저장 됨");
        }
    }
}
public class T08_DeamonThread {
    public static void main(String[] args) {
        AutoSaveThread t1 = new AutoSaveThread();
        t1.setDaemon(true);
        t1.start();
        
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        System.out.println("프로그램 종료");
    }
}
