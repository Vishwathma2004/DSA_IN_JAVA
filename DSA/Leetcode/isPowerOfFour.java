//https://leetcode.com/problems/power-of-four/description/

// 342. Power of Four
// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.
package Leetcode;
import java.util.Scanner;

public class isPowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean ans = PowerOfFour(n);
        if(ans){
            System.out.println(n+ "is a power of 4");
        } 
        else{
            System.out.println(n+" is not power of Four");
        }
        sc.close();
    }
    public static boolean PowerOfFour(int n){
        if(n<=0){
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}
// class Solution {
//     public boolean isPowerOfFour(int n) {
//         return Math.log10(n)/Math.log10(4) % 1 == 0;
//     }
// }