package BinaryTrees;

import java.util.Scanner;

public class binarySearchTree {
    public class Node{
        int value;
        int height;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.height = 0;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public binarySearchTree(){}

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;   
        }
        if(value < node.value){
            node.left = insert(node.left, value); 
        } else if(value > node.value){
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 
            && balanced(node.left) 
            && balanced(node.right);
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this. insert(nums[i]);
        }
    }
    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }
    private void populatedSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
    }
    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();
        int[] nums = {5,2,7,8,1,3,6,4,9};
        tree.populate(nums);
        tree.display();
    }
}
