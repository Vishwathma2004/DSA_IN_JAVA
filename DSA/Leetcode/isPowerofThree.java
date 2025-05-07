//https://leetcode.com/problems/power-of-three/description/
//326. Power of Three

//Given an integer n, return true if it is a power of three. Otherwise, return false.

//An integer n is a power of three, if there exists an integer x such that n == 3x.


import java.util.Scanner;

public class isPowerofThree {
    public static boolean PowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean ans = PowerOfThree(n);
        if(ans){
            System.out.println("Number "+n+" is power of three");
        }
        else{
            System.out.println("Not of power of Three");
        }
        sc.close();
    }
}
