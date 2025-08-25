package _01_thread;

class MyThread3 implements Runnable {

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.printf("%s", new String("*"));
        }
        System.out.println("\n* 소요시간: " +  (System.currentTimeMillis() - startTime));
    }
}
public class T05_MultiThreadTime {
    public static void main(String[] args) {
        new Thread(new MyThread3()).start();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.printf("%s", new String("#"));
        }
        System.out.println("\n# 소요시간: " + (System.currentTimeMillis() - startTime));
    }
}
