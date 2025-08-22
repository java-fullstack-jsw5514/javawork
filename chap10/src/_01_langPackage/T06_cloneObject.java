package _01_langPackage;

class A{
    int num = 3;
}
class Point2 implements Cloneable{
    int x, y;
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    protected Point2 clone() {
        Object o = null;
        try {
            o=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Point2) o;
    }
}
public class T06_cloneObject {
    public static void main(String[] args) {
    }
}
