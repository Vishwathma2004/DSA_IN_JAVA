package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<4;i++){
            arr.add(i);
        }    
        //arr.forEach((item)->System.out.println(item*2));
        Consumer<Integer> fun = (item)->System.out.println(item*2);
        arr.forEach(fun);
        Operation sum = (a,b)->a+b;
        Operation prod = (a,b)->a*b;
        Operation sub = (a,b)->a-b;
        LambdaFunction myCalc = new LambdaFunction();
        System.out.println(myCalc.operate(3, 0, sub));
    }
    private int operate(int a,int b,Operation op){
        return op.operation(a, b);
    }
    int sum(int a,int b){
        return a+b;
    }
}
interface Operation{
    int operation(int a,int b);
}