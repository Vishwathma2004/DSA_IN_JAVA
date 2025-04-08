//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

//167. Two Sum II - Input Array Is Sorted
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//Your solution must use only constant extra space.
package Leetcode;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println("The index is");
        System.out.println(Arrays.toString(sumOfTwo(arr, target)));
        sc.close();

    }
    public static int[] sumOfTwo(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int[] ans = new int[2];
        while (start<end) {
            int sum = arr[start]+arr[end];
            if(sum==target){
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
}