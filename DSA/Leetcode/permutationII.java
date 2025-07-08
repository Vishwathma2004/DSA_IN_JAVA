/*
https://leetcode.com/problems/permutations-ii/description/
47. Permutations II
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

 Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 
*/
package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutationII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res,new ArrayList<>(),nums,new boolean[nums.length]);
        return res;
    }
    public static void backtrack(List<List<Integer>> res,ArrayList<Integer> temp,int[] nums,boolean[] used){
        if(temp.size()==nums.length && !res.contains(temp)){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(res,temp,nums,used);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println(permuteUnique(nums));
    }
}
