//https://leetcode.com/problems/maximum-subarray/description/

//53. Maximum Subarray

//Given an integer array nums, find the subarray with the largest sum, and return its sum.



import java.util.Scanner;

public class MaxSubArray {
    public static int maximum(int[] arr){
        int res = arr[0];
        for(int i=0;i<arr.length;i++){
            int curSum = 0;
            for(int j=i;j<arr.length;j++){
                curSum = curSum + arr[j];
                res = Math.max(curSum, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maximum(arr);
        System.out.println("the largest Sum of array is : "+res);
        sc.close();
    }
}
