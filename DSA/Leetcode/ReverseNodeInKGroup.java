//https://leetcode.com/problems/reverse-nodes-in-k-group/description/

//25. Reverse Nodes in k-Group

//Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

//k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

//You may not alter the values in the list's nodes, only nodes themselves may be changed.

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseNodeInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        // Count the total number of nodes
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        while (length >= k) {
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = null;
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            prev = newEnd;
            length -= k;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of nodes
        System.out.print("Enter the number of nodes in the linked list: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of nodes. Exiting...");
            scanner.close();
            return;
        }

        // Creating linked list
        System.out.print("Enter the value for node 1: ");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter the value for node " + i + ": ");
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        // Get value of k
        System.out.print("Enter the value of k for reversal: ");
        int k = scanner.nextInt();

        System.out.println("\nOriginal List:");
        printList(head);

        // Call reverseKGroup function
        ReverseNodeInKGroup solution = new ReverseNodeInKGroup();
        ListNode newHead = solution.reverseKGroup(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        printList(newHead);

        scanner.close();
    }
}
