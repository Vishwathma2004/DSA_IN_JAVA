/*
https://leetcode.com/problems/first-missing-positive/description/
41. First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
 */
public class First_Missing_Positive {
    public static  int firstMissingPositive(int[] arr) {
        int i=0 ;
        int n = arr.length;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]<n && arr[i]>0 && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr1));
        int[] arr2 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr2));
    }
}
