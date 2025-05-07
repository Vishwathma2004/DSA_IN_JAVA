//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
//215. Kth Largest Element in an Array
//Given an integer array nums and an integer k, return the kth largest element in the array.

//Note that it is the kth largest element in the sorted order, not the kth distinct element.



import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementinArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
        for (int num : nums) {
            if (pq.size() < k) {
                pq.add(num);
            } else if (pq.peek() < num) {
                pq.poll();
                pq.add(num);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth number: ");
        int k = sc.nextInt();
        System.out.println("The "+k+"th largest number is "+findKthLargest(arr,k));
        sc.close();
    }
}
