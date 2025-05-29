//https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=array
/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */
import java.util.Scanner;

class moveZeros{
    public static void move(int[] nums){
        int insertPosition = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while(insertPosition<nums.length){
            nums[insertPosition++] =0; 
        }
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
        System.out.println("Final Array is : ");
        move(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}