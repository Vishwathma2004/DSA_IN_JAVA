package Leetcode;

import java.util.List;
import java.util.Scanner;

public class PreOrderTraversal_i {
    public class Node {
        int value;
        Node left;
        Node right;
        public Node(int val){
            this.value = val;
        }
        public Node(int value,Node left,Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ");
        sc.close();
    }
    public List<Integer> preOrderTraversal(Node root){
        
    }
    @Override
    public String toString() {
        return "PreOrderTraversal_i []";
    }
}