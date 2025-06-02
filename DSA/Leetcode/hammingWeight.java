//https://leetcode.com/problems/number-of-1-bits/description/
/*
191. Number of 1 Bits
Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
Example 1:
Input: n = 11
Output: 3

Explanation:
The input binary string 1011 has a total of three set bits.

Example 2:
Input: n = 128
Output: 1

Explanation:
The input binary string 10000000 has a total of one set bit.
 */
import java.util.Scanner;

public class hammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Number of set bits is "+hammingWeight(n));
        sc.close();
    }
}
