//https://leetcode.com/problems/longest-consecutive-sequence/description/
//128. Longest Consecutive Sequence

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

//You must write an algorithm that runs in O(n) time.



import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static int longestSequence(int[] nums){
        int currentStreak = 1;
        int longestStreak = 1;
        if(nums.length == 0|| nums==null){
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    currentStreak++;
                }
                else{
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }
        return Math.max(currentStreak, longestStreak);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(" The length of the longest consecutive elements sequence");
        System.out.println(longestSequence(nums));
        sc.close();
    }
    
}