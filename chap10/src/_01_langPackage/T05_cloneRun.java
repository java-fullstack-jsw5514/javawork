package _01_langPackage;

class Point implements Cloneable{
    int x, y;
    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    @Override
    protected Point clone() {
        Object o = null;
        try {
            o=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Point) o;
//        return new Point(x,y);
    }
}
public class T05_cloneRun {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        int dummy = 0;
        try {
            while (true) {
                long timeStart = System.currentTimeMillis();
                for (long i = 0; i < 10000000; i++) {
                    Point p2 = p1.clone();
                    dummy += p2.hashCode();
                }
                long timeEnd = System.currentTimeMillis();
                System.out.println("time : " + (timeEnd - timeStart));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dummy);
    }
}
