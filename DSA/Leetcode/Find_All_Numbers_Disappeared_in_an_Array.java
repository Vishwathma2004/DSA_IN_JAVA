/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
448. Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
import java.util.*;
public class Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int i =0 ;
        int n =arr.length;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
