//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/
/*
987. Vertical Order Traversal of a Binary Tree
Solved
Hard
Topics
Companies
Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).

The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.

Return the vertical order traversal of the binary tree.
 */

package Leetcode;

import java.util.*;

public class VerticalOrder {
    public static void main(String[] args) {
        // Create the tree: [1,2,3,4,6,5,7]
        TreeNode root = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(4),
                new TreeNode(6)
            ),
            new TreeNode(3,
                new TreeNode(5),
                new TreeNode(7)
            )
        );

        VerticalOrder solution = new VerticalOrder();
        List<List<Integer>> result = solution.verticalTraversal(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // List to hold triplets: (col, row, value)
        List<int[]> nodeList = new ArrayList<>();

        // Queue to hold (node, row, col)
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {
            Tuple t = queue.poll();
            TreeNode node = t.node;
            int row = t.row;
            int col = t.col;

            nodeList.add(new int[]{col, row, node.val});

            if (node.left != null) {
                queue.offer(new Tuple(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                queue.offer(new Tuple(node.right, row + 1, col + 1));
            }
        }

        // Sort by column, then row, then value
        Collections.sort(nodeList, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });

        // Group by column
        int prevCol = Integer.MIN_VALUE;
        List<Integer> current = new ArrayList<>();
        for (int[] arr : nodeList) {
            int col = arr[0], val = arr[2];
            if (col != prevCol) {
                if (!current.isEmpty()) {
                    ans.add(current);
                }
                current = new ArrayList<>();
                prevCol = col;
            }
            current.add(val);
        }
        ans.add(current); // Add the last group

        return ans;
    }

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Helper class to track node position
    static class Tuple {
        TreeNode node;
        int row;
        int col;
        Tuple(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
}

