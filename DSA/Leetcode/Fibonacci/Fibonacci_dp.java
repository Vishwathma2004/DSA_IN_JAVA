//https://leetcode.com/problems/fibonacci-number/description/
//✅ Efficient with O(n) time and O(n) space.

package Fibonacci;

import java.util.Scanner;

public class Fibonacci_dp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The fibanacci of "+n+"th term is(Using Bottom-Up Approach)");
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int[] fib = new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
