package StackAndQueues;

import java.util.Stack;

public class InBuildExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(34);
        stack.push(50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); 
    }
}
