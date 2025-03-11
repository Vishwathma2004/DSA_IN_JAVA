//https://leetcode.com/problems/palindrome-linked-list/

//234. Palindrome Linked List
package Leetcode;
import java.util.Scanner;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of elements
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Empty linked list.");
            scanner.close();
            return;
        }

        // Creating the linked list
        System.out.print("Enter the elements: ");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        // Taking left and right indices
        System.out.print("Enter left index: ");
        int left = scanner.nextInt();
        System.out.print("Enter right index: ");
        int right = scanner.nextInt();
        scanner.close();

        // Reversing the sublist
        head = reverseBetween(head, left, right);

        // Printing the modified list
        System.out.println("Linked List after reversing from position " + left + " to " + right + ":");
        printList(head);
    }

    // Function to reverse the sublist between left and right
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        // Move to the left-th node
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = null;

        // Reverse the sublist
        for (int i = 0; current != null && i < right - left + 1; i++) {
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
        return head;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}