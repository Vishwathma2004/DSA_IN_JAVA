//https://leetcode.com/problems/squares-of-a-sorted-array/description/
//977. Squares of a Sorted Array

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each 
//number sorted in non-decreasing order.

 



import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements (sorted in non-decreasing order):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The squares of elements in the array are:");
        System.out.println(Arrays.toString(sortedSquares(arr)));

        sc.close();
    }

    public static int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);  // 🔥 Added sorting
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
    
        while (left <= right) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];
            if (leftVal > rightVal) {
                result[pos--] = leftVal;
                left++;
            } else {
                result[pos--] = rightVal;
                right--;
            }
        }
        return result;
    }
    
}
