//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
/*
653. Two Sum IV - Input is a BST

Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true
 */



import java.util.HashSet;
import java.util.Scanner;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class TwoSumIV {
    
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    public static boolean helper(TreeNode node, int k, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }
        if (set.contains(k - node.val)) {
            return true;
        }
        set.add(node.val);
        return helper(node.left, k, set) || helper(node.right, k, set);
    }

    // Method to insert nodes into the BST
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to construct a BST from an array of integers
    public static TreeNode constructBST(int[] values) {
        TreeNode root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the tree input as a space-separated string of integers
        System.out.println("Enter the elements of the BST (space-separated): ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int[] values = new int[tokens.length];
        
        for (int i = 0; i < tokens.length; i++) {
            values[i] = Integer.parseInt(tokens[i]);
        }

        // Construct the BST
        TreeNode root = constructBST(values);

        // Take the target sum input
        System.out.println("Enter the target sum k: ");
        int k = scanner.nextInt();

        // Check if two elements sum up to k
        boolean result = findTarget(root, k);

        // Output the result
        if (result) {
            System.out.println("Yes, there are two elements in the BST whose sum is " + k);
        } else {
            System.out.println("No, there are no two elements in the BST whose sum is " + k);
        }

        scanner.close();
    }
}
