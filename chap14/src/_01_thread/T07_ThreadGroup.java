package _01_thread;

public class T07_ThreadGroup {
    public static void main(String[] args) {
        var main = Thread.currentThread().getThreadGroup();
        ThreadGroup group1 =  new ThreadGroup("T07_ThreadGroup");
        System.out.println("그룹명: " + group1.getName());
        
        ThreadGroup subgroup =  new ThreadGroup(group1,"T07_ThreadGroup2");
        ThreadGroup tg3 =  new ThreadGroup("T07_ThreadGroup3");
        
        group1.setMaxPriority(9);
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(group1,r1,"t1");
        Thread t2 = new Thread(subgroup,r1,"t2");
        Thread t3 = new Thread(tg3,r1,"t3");
        
        t1.start();
        t2.start();
        t3.start();

        System.out.println("실행중인 스레드 상위 그룹: "+main.getName());
        System.out.println("실행중인 스레드 그룹의 수: "+main.activeGroupCount());
        System.out.println("실행중인 스레드 수: "+main.activeCount());
        main.list();
    }
}
