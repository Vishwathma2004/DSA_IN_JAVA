// https://leetcode.com/problems/power-of-two/description/
// 231. Power of Two
// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.



import java.util.Scanner;

public class isPowerOfTwo {
    public static boolean powerofTwo(int n){
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean ans = powerofTwo(n);
        if(ans){
            System.out.println("The "+n+" is power of two");
        }
        else{
            System.out.println("The number is not power of two");
        }
    }
}