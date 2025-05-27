//https://leetcode.com/problems/single-number/description/
/*
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Example 1:

Input: nums = [2,2,1]

Output: 1
 */
package Leetcode;

import java.util.Scanner;

class SingleNumber {
    public static int singleNumber(int[] nums){
        int sign = nums[0];
        for(int i=1;i<nums.length;i++){
            sign = sign ^ nums[i];
        }
        return sign;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The single number is: "+singleNumber(nums));
        sc.close();
    }
    
}