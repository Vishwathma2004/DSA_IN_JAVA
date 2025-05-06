package DP;
import java.util.Scanner;

public class Fiboonacci {
    public static int fib(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n] = fib(n-1, dp)+fib(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
         * TC = O(N)
         * SC = O(N)
         */
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        for(int i =0 ;i<=n;i++){
            dp[i] = -1;
        }
        System.out.println("Fibonacci number of "+n+" is:");
        System.out.println(fib(n,dp));
        //eliminating space complexity
        int prev = 0;
        int current = 1;
        for(int i=2;i<=n;i++){
            int next = prev+current;
            prev = current;
            current = next;
        }
        System.out.println("The answer after eleminating space complexity is "+current);
        
    }
}
