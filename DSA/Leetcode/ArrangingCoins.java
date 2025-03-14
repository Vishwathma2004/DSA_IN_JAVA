package Leetcode;

import java.util.Scanner;

public class ArrangingCoins {
    public static int coinArrange(int n){
        int start = 0;
        int end = n;
        int mid = 0;
        int ans =0;
        while (start<=end) {
            mid = start + (end-start)/2;
            long coinCount = ( (long) mid*(mid+1))/2;
            if(coinCount<=n){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int n = sc.nextInt();
        System.out.println("The number of complete rows of the staircase you will build is: ");
        System.out.println(coinArrange(n));
        sc.close();
    }
}