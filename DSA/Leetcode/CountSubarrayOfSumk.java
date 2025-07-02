import java.util.*;

class CountSubarrayOfSumk {
    public static int sumOfSubArrays(int[] nums, int k) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        int sum = 0, count = 0;
        prefix.put(0, 1);  // Initialize with sum 0 having occurred once (to handle exact sum k subarrays)
        
        for (int num : nums) {
            sum += num;  // Update the running sum
            count += prefix.getOrDefault(sum - k, 0);  // If (sum - k) is in the map, add its frequency to count
            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);  // Update the map with the current sum
        }
        
        return count;
    }

    public static void main(String[] args) {
        // Example test case
        int[] nums = {1, 2, 3};  // Array
        int k = 3;               // Target sum
        
        // Call the method and print the result
        int result = sumOfSubArrays(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
