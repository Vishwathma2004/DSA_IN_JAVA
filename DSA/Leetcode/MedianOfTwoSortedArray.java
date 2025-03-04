//https://leetcode.com/problems/median-of-two-sorted-arrays/description/

//4. Median of Two Sorted Arrays
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n))
package Leetcode;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in first array");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in 2nd array");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeSort(arr1,arr2);
        sc.close();
    }
    public static void mergeSort(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] arr3 = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            arr3[k++] = arr2[j++];
        }
        int middle = arr3.length/2;
        double median;
        if(arr3.length%2!=0){
            median = arr3[middle];
        }
        else{
            median = (arr3[middle]+arr3[middle-1])/2;
        }
        System.out.println("Median is "+median);
    }
}
