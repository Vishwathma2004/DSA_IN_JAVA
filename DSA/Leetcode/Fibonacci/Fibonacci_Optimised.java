//https://leetcode.com/problems/fibonacci-number/description/
//O(n) time and O(1) space

package Fibonacci;

import java.util.Scanner;

public class Fibonacci_Optimised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Fibonacci of "+n+"th number is(Using Optimised Approach)");
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
