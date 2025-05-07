
//https://leetcode.com/problems/reorder-list/description/

//143. Reorder List


import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid.next);
        mid.next = null; // Break the first half properly
        ListNode hf = head;
        
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null && f.next.next != null) { // Stop one node earlier
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        while (present != null) {
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of elements
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("The linked list should have at least one element.");
            return;
        }

        // Taking user input for the linked list values
        System.out.print("Enter the elements: ");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        System.out.println("\nOriginal List:");
        printList(head);

        // Reordering the list
        ReorderList obj = new ReorderList();
        obj.reorderList(head);

        System.out.println("\nReordered List:");
        printList(head);

        scanner.close();
    }
}
