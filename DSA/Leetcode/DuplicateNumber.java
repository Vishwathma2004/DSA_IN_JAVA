//https://leetcode.com/problems/find-the-duplicate-number/
//287. Find the Duplicate Number

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

//There is only one repeated number in nums, return this repeated number.

//You must solve the problem without modifying the array nums and using only constant extra space.

package Leetcode;

import java.util.Scanner;

public class DuplicateNumber {
    public static int duplicate(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            ele = Math.abs(ele);
            if(nums[ele]>0){
                nums[ele] = -nums[ele];
            }
            else{
                ans = ele;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (including a duplicate): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = duplicate(nums);
        System.out.println("Duplicate element is: " + result);

        sc.close();
    }   
}
