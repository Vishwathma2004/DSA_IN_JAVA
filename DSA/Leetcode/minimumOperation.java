//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08
/*
3396. Minimum Number of Operations to Make Elements in Array Distinct
You are given an integer array nums. You need to ensure that the elements in the array are distinct. To achieve this, you can perform the following operation any number of times:

Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.
Note that an empty array is considered to have distinct elements. Return the minimum number of operations needed to make the elements in the array distinct.

 

Example 1:

Input: nums = [1,2,3,4,2,3,3,5,7]

Output: 2
 */


import java.util.Scanner;

public class minimumOperation {
    public static int minimumOperation(int[] nums) {
        int n = nums.length;
        int[] hash = new int[101];
        for(int num:nums){
            hash[num]++;
        }
        int ans = 0;
        int idx = 0;
        while(!unique(hash)){
            int count = 3;
            while(idx<n && count-->0){
                hash[nums[idx]]--;
                idx++;
            }
            ans++;
        }
        return ans;
    }
    private static boolean unique(int[] hash){
        for(int i=0;i<hash.length;i++){
            if(hash[i]>1)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Take the array elements as input
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the minimumOperation function
        int result = minimumOperation(nums);
        System.out.println("Minimum operations required: " + result);

        scanner.close();
    }
}
