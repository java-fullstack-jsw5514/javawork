package _04_overloading;

public class OverOp {
    int num = 1;
    
    int sub() {
        return num;
    }
    int sub(int n) {
        return num - n;
    }
    int sub(int a, int b) {
        return a - b;
    }
    
    int mul() {
        return num;
    }
    int mul(int n) {
        return num * n;
    }
    int mul(int a, int b) {
        return a * b;
    }
    
    double dev(){
        return num;
    }
    double dev(int n){
        return (double) num / n;
    }
    double dev(int a, int b){
        return (double) a / b;
    }
}
