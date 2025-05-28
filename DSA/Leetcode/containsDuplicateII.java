//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=array
/*
219. Contains Duplicate II

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class containsDuplicateII {
    public static boolean findDuplicate(int[] nums,int k){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
                int pastIndex = hm.get(nums[i]);
                if(Math.abs(pastIndex-i)<=k){
                    return true;
                }
                else{
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        if(findDuplicate(nums,k)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
