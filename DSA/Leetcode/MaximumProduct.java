//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
//1464. Maximum Product of Two Elements in an Array
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value 
//of (nums[i]-1)*(nums[j]-1).

package Leetcode;

import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Product of two max elements is: ");
        System.out.println(maxProduct(arr));

    }
    public static  int maxProduct(int[] arr){
        int max = -1;
        int secondMax = -1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondMax = max;
                max = arr[i];
            }
            else if(secondMax<arr[i]){
                secondMax = arr[i];
            }
        }
        int ans = (max - 1) * (secondMax - 1);
        return ans;
    }
}
