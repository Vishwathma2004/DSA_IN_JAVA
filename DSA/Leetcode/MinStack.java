//https://leetcode.com/problems/min-stack/description/
//155. Min Stack

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

//Implement the MinStack class:

//MinStack() initializes the stack object.
//void push(int val) pushes the element val onto the stack.
//void pop() removes the element on the top of the stack.
//int top() gets the top element of the stack.
//int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.


import java.util.Scanner;
import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (st.size() == 0 || min.peek() >= val) {
            min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if (st.pop().equals(min.peek())) {
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack obj = new MinStack();
        
        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Top\n4. Get Min\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    obj.push(val);
                    System.out.println(val + " pushed to stack.");
                    break;
                
                case 2:
                    if (!obj.st.isEmpty()) {
                        obj.pop();
                        System.out.println("Top element popped from stack.");
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                
                case 3:
                    if (!obj.st.isEmpty()) {
                        System.out.println("Top element is: " + obj.top());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                
                case 4:
                    if (!obj.st.isEmpty()) {
                        System.out.println("Minimum element is: " + obj.getMin());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
