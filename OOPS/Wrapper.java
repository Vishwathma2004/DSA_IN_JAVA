package OOPS;

import java.util.stream.Gatherer.Integrator;

public class Wrapper {
    public static void main(String[] args) {
        //int a=10;
        //num is an object
        Integer num =45;
        System.out.println(num);
        int b=40;
        int c = 50;
        swap(b,c);
        //System.out.println(b+" "+c);
        Integer a=10;
        Integer d = 20;
        swap(a, d);
        System.out.println(a+" "+d);
        
    }
    static void swap(Integer a,Integer b){
        int temp = a;
        a = b;
        b= temp;
        // System.out.println(a+" "+b);
    }
}
