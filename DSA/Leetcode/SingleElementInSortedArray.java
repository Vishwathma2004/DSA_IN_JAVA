//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
//540. Single Element in a Sorted Array
//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

//Return the single element that appears only once.

//Your solution must run in O(log n) time and O(1) space.

package Leetcode;

import java.util.Scanner;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println(singleNonDuplicateElement(arr));
    }
    public static int singleNonDuplicateElement(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                left = mid+2;
            }
            else{
                right = mid;
            }
        }
        return arr[left];
    }

}
