package _06_constructor;

class ThisConOver {
    int num;
    double dou;
    String name;

    ThisConOver(){
        num=1;
        dou=1f;
        name="홍길동";
    }
    ThisConOver(int num) {
        this.num=num;
        dou=1f;
        name="홍길동";
    }
    ThisConOver(String name){
        this.num=1;
        dou=1f;
        this.name=name;
    }
    ThisConOver(int num, double dou){
        this.num=num;
        this.dou=dou;
        name="홍길동";
    }
    ThisConOver(int num, double dou, String name){
        this.num=num;
        this.dou=dou;
        this.name=name;
    }


    public void info() {
        System.out.println("num="+num);
        System.out.println("dou="+dou);
        System.out.println("name="+name);
    }
}

public class ConOverloading {
}
