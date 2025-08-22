package _05_interfaceDefault;

interface Inter1{
    int method1();
    static String stMe(){
        return "static 메소드";
    }
}
interface Inter2{
    int method2();
    default String deMe(){
        return "default 메소드 Inter2";
    }
}
public interface Inter extends Inter1,Inter2{
    int method();
    default String me(){
        return "default 메소드 Inter";
    }
}
