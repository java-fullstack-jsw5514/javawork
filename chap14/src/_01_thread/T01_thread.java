package _01_thread;

class Thread1 implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("first thread");
    }
}
class Thread2 implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("second thread");
    }
}
public class T01_thread {
    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
}
