//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

//19. Remove Nth Node From End of List

//Given the head of a linked list, remove the nth node from the end of the list and return its head.


//package Leetcode;

public class RemoveNthNode {
    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both fast and slow pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Removing the 2nd node from the end (which is '4')
        RemoveNthNode remover = new RemoveNthNode();
        head = remover.removeNthFromEnd(head, 2);

        // Printing the updated linked list
        printList(head);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
