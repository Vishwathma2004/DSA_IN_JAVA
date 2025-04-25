//https://leetcode.com/problems/combination-sum/description/?envType=problem-list-v2&envId=array
/*
39. Combination Sum

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
 */

package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Solution;

public class CandidateSumI {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        findCombination(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    public void findCombination(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return; 
        }
        for(int i = index; i < candidates.length; i++){
            if(candidates[i] <= target){
                current.add(candidates[i]);
                findCombination(candidates, i, target - candidates[i], current, result);
                current.remove(new Integer(candidates[i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the candidates array
        System.out.println("Enter the number of candidates:");
        int n = scanner.nextInt();
        
        int[] candidates = new int[n];
        System.out.println("Enter the candidates (space-separated):");
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        // Taking user input for the target sum
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        
        // Getting the result
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        
        // Printing the result
        System.out.println("Combinations that sum to " + target + ":");
        if (result.isEmpty()) {
            System.out.println("No combinations found.");
        } else {
            for (List<Integer> combination : result) {
                System.out.println(combination);
            }
        }

        scanner.close();
    }
}
