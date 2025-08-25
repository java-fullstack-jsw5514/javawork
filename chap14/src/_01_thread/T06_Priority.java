package _01_thread;

class Thread4 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.print(T06_Priority.s1);
        }
        System.out.println("\nt4 끝!");
    }
}
class Thread5 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.print(T06_Priority.s2);
        }
        System.out.println("\nt5 끝!");
    }
}
public class T06_Priority {
    public static String s1 = "1";
    public static String s2 = "2";
    public static void main(String[] args) {
        Thread t4 = new Thread4();
        Thread t5 = new Thread5();
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.start();
        t5.start();
    }
}
