//https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
/*
230. Kth Smallest Element in a BST

Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of
the nodes in the tree.
 */


import java.util.PriorityQueue;

public class kthSmallestNumber {
    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
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

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, minHeap, k);
        int ans = 0;

        for (int i = 0; i < k; i++) {
            ans = minHeap.poll();
        }
        return ans;
    }

    private void helper(TreeNode node, PriorityQueue<Integer> minHeap, int k) {
        if (node == null) {
            return;
        }
        helper(node.left, minHeap, k);
        minHeap.offer(node.val);
        helper(node.right, minHeap, k);
    }

    public static void main(String[] args) {
        // Constructing a simple binary search tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        kthSmallestNumber solution = new kthSmallestNumber();
        int k = 1;
        System.out.println("The " + k + "th smallest element is: " + solution.kthSmallest(root, k));
    }
}
