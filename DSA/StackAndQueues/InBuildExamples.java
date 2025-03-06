package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
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
        System.out.println("This is a Stack DataStructure");
        System.out.println("This is Last In Last Out(LIFO)");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); 
        Queue<Integer> queue = new LinkedList<>();
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        System.out.println("This is a Queue Linked List");
        System.out.println("This is First in First Out(FIFO)");
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        
        System.out.println("\nThis is a Double Ended Queue");
        System.out.println("Deque will be in ArrayDeque Class");
        Deque<Integer> deque = new ArrayDeque<>(); 
        deque.add(5);
        deque.add(6);
        System.out.println(deque.remove());
    }
}
