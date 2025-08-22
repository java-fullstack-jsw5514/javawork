package test;

public class MyClass{
    private final int a;
    private final double b;
    private final boolean c;
    private MyClass(Builder builder){
        a = builder.a;
        b = builder.b;
        c = builder.c;
    }
    public static class Builder{
        private int a = 1;
        private double b = 2f;
        private boolean c = false;
        public Builder setA(int a){
            this.a = a;
            return this;
        }
        public Builder setB(double b){
            this.b = b;
            return this;
        }
        public Builder setC(boolean c){
            this.c = c;
            return this;
        }
        public MyClass build(){
            return new MyClass(this);
        }
    }
}