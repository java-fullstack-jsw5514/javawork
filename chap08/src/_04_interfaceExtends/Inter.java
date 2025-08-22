package _04_interfaceExtends;

interface Inter1{
    int method1();
}
interface Inter2{
    int method2();
}
public interface Inter extends Inter1,Inter2{
    int method();
}
