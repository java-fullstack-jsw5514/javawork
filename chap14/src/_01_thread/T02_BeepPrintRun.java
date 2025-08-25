package _01_thread;

import java.awt.*;

public class T02_BeepPrintRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("삑");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        new Thread(new T02_BeepPrintRun()).start();
        for (int k = 0; k < 5; k++) {
            toolkit.beep();
            Thread.sleep(1000);
        }
    }
}
