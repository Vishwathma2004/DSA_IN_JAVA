//https://leetcode.com/problems/ugly-number/description/
/*
263. Ugly Number
An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number.
Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 */
import java.util.Scanner;

public class UglyNumber {
    public static boolean ugly(int n){
        if(n<=0) return false;
        while (n%2==0) n/=2;
        while (n%3==0) n/=3;
        while (n%5==0) n/=5;
        if(n==1) return true;
        return false;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean ans = ugly(n);
        if(ans){
            System.out.println("The "+n+" is ugly number");
        }else{
            System.out.println("The "+n+" is not ugly number");
        }
    }
}
