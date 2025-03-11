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
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public binarySearchTree(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }

}
