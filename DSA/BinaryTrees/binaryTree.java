package BinaryTrees;

import java.util.Scanner;

public class binaryTree {
    private static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root node value");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Display method
    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) { 
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t"); 
    }

    // Pretty display method
    public void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
    
        // First, print the left subtree
        prettyDisplay(node.left, level + 1);
    
        // Print the current node with proper indentation
        if (level > 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t"); // Vertical connection
            }
            System.out.println("|-------> " + node.value);
        } else {
            System.out.println(node.value); // Root node
        }
    
        // Finally, print the right subtree
        prettyDisplay(node.right, level + 1);
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.populate(sc);
        tree.display();
        tree.prettyDisplay(tree.root, 0); 
        sc.close(); 
    }
}
