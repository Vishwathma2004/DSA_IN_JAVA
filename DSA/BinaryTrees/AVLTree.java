package BinaryTrees;

import java.util.Scanner;

public class AVLTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public AVLTree(){

    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    private Node root;
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(value, node.left);
        }
        if(value>node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right));
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //right-right case
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                //left-right case
                node.right = rightRotate(node.right);
                return leftRotate(node); 
            }
        }
        return node;
    }
    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = p.left.right;
        c.right = p;
        p.left = t;
        
        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);
        return c;

    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        
        
        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);
        return p;

    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public boolean isEmpty(){
        return root==null;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insert(value);
        }

        System.out.println("Is the tree balanced? " + tree.balanced());

        System.out.print("Enter the value to insert: ");
        int newValue = sc.nextInt();
        tree.insert(newValue);
        System.out.println("After inserting " + newValue + ", is the tree balanced? " + tree.balanced());

        sc.close();
    }
}
