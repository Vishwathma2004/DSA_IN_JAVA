//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
//2089. Find Target Indices After Sorting Array
//You are given a 0-indexed integer array nums and a target element target.

//A target index is an index i such that nums[i] == target.

//Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list.
//The returned list must be sorted in increasing order.



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int tcount = 0;
        int num = 0;
        for (int ele : nums) {
            if (ele == target) {
                tcount++;
            } else if (ele < target) {
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (tcount > 0) {
            ans.add(num);
            tcount--;
            num++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();


        List<Integer> result = targetIndices(nums, target);

        // Displaying result
        System.out.println("Target indices: " + result);

        scanner.close();
    }
}
