/*
https://leetcode.com/problems/permutations/description/
46. Permutations
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]

 */
package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    public static void backtrack(List<List<Integer>> res,ArrayList<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String arg[]){
        int[] nums = new int[]{1,2,3};
        System.out.println(permute(nums));
    }
}
