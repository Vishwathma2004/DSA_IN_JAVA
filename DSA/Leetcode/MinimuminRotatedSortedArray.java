package Leetcode;

import java.util.Scanner;

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
        sc.close();
    }
    public static int findMin(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            if(arr[start]<arr[end]){
                return arr[start];
            }
            int mid = start + (end - start)/2;
            if(mid > 0 && arr[mid-1]>arr[mid]){
                return arr[mid];
            }
            else if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            else if(arr[start]<=arr[mid]){
                start = mid + 1 ;
            }
            else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}