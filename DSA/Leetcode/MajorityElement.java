//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array
/*
169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 */

//package Leetcode;

import java.util.Scanner;

public class MajorityElement {
    public static int majorityVote(int[] nums){
        int majority = nums[0];
        int votes = 1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority = nums[i];
            }
            else if(majority==nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The majority element is "+majorityVote(arr));
        sc.close();
    }
}
