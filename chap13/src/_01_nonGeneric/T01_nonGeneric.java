package _01_nonGeneric;

class Apple{}
class Banana{}
class Box{
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
public class T01_nonGeneric {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("더조은");
        String name = (String)box.getObj();
        
        box.setObj(new Apple());
        Apple name2 = (Apple)box.getObj();
    }
}
