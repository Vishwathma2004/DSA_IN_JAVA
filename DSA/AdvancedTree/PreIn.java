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

    
package AdvancedTree;

import java.util.HashMap;
class TreeNode {
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
public class PreIn {
    static int index = 0;
    public TreeNode buildTree(int[] preorder,int[] inOrder){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<inOrder.length;i++){
            map.put(inOrder[i], i);
        }
        int[] index = {0};
        return helper(preorder,inOrder,0,preorder.length-1,map,index);
    }
    public TreeNode helper(int[] preorder,int[] inOrder,int left,int right,HashMap<Integer,Integer> map,int[] index){
        if(left>right){
            return null;
        }
        int current = preorder[index[0]];
        index[0]++;
        TreeNode node = new TreeNode(current);
        
        if(left==right){
            return node;
        }
        int inOrderIndex = map.get(current);
        node.left = helper(preorder, inOrder, left, inOrderIndex-1, map,index);
        node.right = helper(preorder, inOrder, inOrderIndex+1, right, map,index);

        return node;
    }
}