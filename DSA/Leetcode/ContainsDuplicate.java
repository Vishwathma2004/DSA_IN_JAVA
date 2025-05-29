//https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array
/*
217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
 */


//package Leetcode;
import java.util.HashSet;
import java.util.Scanner;

class ContainsDuplicate{
    public static boolean findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
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
        boolean ans = findDuplicate(nums);
        System.out.println(ans);
    }
}