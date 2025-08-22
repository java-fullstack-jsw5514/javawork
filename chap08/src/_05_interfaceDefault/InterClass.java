package _05_interfaceDefault;

public class InterClass implements Inter{
    @Override
    public int method() {
        return 0;
    }

    @Override
    public int method1() {
        return 0;
    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String me() {
        return "오버라이딩한 메소드 me()";
    }

    @Override
    public String deMe() {
        return "오버라이딩한 메소드 deMe()";
    }
}
