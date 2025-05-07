//https://leetcode.com/problems/find-pivot-index/description/
//724. Find Pivot Index
//Given an array of integers nums, calculate the pivot index of this array.

//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

//Return the leftmost pivot index. If no such index exists, return -1.



import java.util.Scanner;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums){
        int leftSum  = 0;
        int totalSum = 0;
        for(int ele:nums){
            totalSum =totalSum+ele;
        }
        for (int i = 0; i < nums.length; i++) {
            if(leftSum ==totalSum-leftSum-nums[i]){
                return i;
            }
            leftSum +=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Pivot index is: ");
        System.out.println(pivotIndex(nums));
        sc.close();
    }
}
