package _01_thread;

import java.util.Random;

class Bank {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }
    public synchronized boolean withdraw(int amount) {
        if(balance>=amount)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=amount;
            return true;
        }
        return false;
    }
}

class ThreadSy implements Runnable{
    private static Bank b = new Bank();
    private final String TAG;

    ThreadSy(String tag) {
        TAG = tag;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(b.getBalance() > 0) {
            int money = (rand.nextInt(2)+1)*100;
            b.withdraw(money);
            System.out.println(TAG+": 잔액: " + b.getBalance());
        }
    }
}
public class T11_synchronized {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadSy("t1"));
        Thread t2 = new Thread(new ThreadSy("t2"));
        t1.start();
        t2.start();
    }
}
