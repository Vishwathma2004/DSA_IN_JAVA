//https://leetcode.com/problems/sqrtx/description/
//69. Sqrt(x)

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

//You must not use any built-in exponent function or operator.

//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

package Leetcode;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number to find its sqrt");
        int n = sc.nextInt();
        System.out.println("Square root of "+n+" is:");
        System.out.println(squareRoot(n));
        sc.close();
        
    }
    public static int squareRoot(int n){
    //     int ans = 0;
    //     for (long i = 1; i*i <= n; i++) {
    //         ans = (int) i;
    //     }
    //     return ans;
        int ans = 0;
        int start = 1,end = n;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (mid<=n/mid) {
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
}
