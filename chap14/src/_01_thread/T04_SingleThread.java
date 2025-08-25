package _01_thread;

class MyThread1 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
public class T04_SingleThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.printf("#");
        }
        System.out.println("\n소요시간 = " + (System.currentTimeMillis() - startTime));
    }
}
