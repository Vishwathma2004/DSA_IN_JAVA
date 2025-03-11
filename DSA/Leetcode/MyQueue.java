//https://leetcode.com/problems/implement-queue-using-stacks/description/
//232. Implement Queue using Stacks

//Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

//Implement the MyQueue class:

//void push(int x) Pushes element x to the back of the queue.
//int pop() Removes the element from the front of the queue and returns it.
//int peek() Returns the element at the front of the queue.
//boolean empty() Returns true if the queue is empty, false otherwise.
//Notes:

//You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
//Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations

package Leetcode;
import java.util.Stack;
import java.util.Scanner;

class MyQueue {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        // Step 1: Transfer all elements from main to helper
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }
        // Step 2: Add the new element to main
        main.push(x);
        // Step 3: Transfer back all elements from helper to main
        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }
    }
    
    public int pop() {
        if (main.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return main.pop();
    }
    
    public int peek() {
        if (main.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue queue = new MyQueue();

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    queue.push(val);
                    System.out.println(val + " pushed to queue.");
                    break;

                case 2:
                    if (!queue.empty()) {
                        System.out.println("Popped value: " + queue.pop());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 3:
                    if (!queue.empty()) {
                        System.out.println("Front element: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Is queue empty? " + queue.empty());
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
