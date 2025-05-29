//https://leetcode.com/problems/third-maximum-number/?envType=problem-list-v2&envId=array
/*
414. Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
 */

import java.util.Scanner;


public class thirdMax {
    public static int findThirdMax(int[] nums){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int num:nums){
            if(num==first || num==second || num==third) continue;
            if(num>first){
                third = second;
                second = first;
                first = num;
            }
            else if (first > num && num>second){
                third = second;
                second = num;
            }
            else if(second>num && num>third){
                third = num;
            }
        }
        return third==Long.MIN_VALUE ? (int)first:(int)third;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Third Max Element is :"+findThirdMax(nums));
        sc.close();
    }
}
