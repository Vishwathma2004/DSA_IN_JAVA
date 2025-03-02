package Polymorphism;

public class Number {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Number number = new Number();
        number.sum(2,3);
        number.sum(2,3,4);
    }
}
