//https://leetcode.com/problems/fibonacci-number/description/
//Recursion is simple but inefficient for large n due to repeated calculations (O(2^n) time complexity).

import java.util.Scanner;

public class Fibonacci_rec {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The fibanacci of "+n+"th term is(Using Recursion)");
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}