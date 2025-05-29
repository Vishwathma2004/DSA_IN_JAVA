//https://leetcode.com/problems/remove-element/description/
//27. Remove Element

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.


//package Leetcode;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to remove: ");
        int val = sc.nextInt();
        System.out.println("The number of elements in array after removing the value is");
        System.out.println(removeElement(arr,val));
    }
    public static int removeElement(int[] nums, int val) {
        int i =0,ptr = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}
