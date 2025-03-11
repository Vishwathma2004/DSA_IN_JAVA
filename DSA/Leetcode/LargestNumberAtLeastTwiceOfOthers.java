// https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/1557220992/
//747. Largest Number At Least Twice of Others
//You are given an integer array nums where the largest integer is unique.
//Determine whether the largest element in the array is at least twice as much as every other number in the array.
//If it is, return the index of the largest element, or return -1 otherwise.

package Leetcode;
import java.util.Scanner;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Answer is ");
        System.out.println(CheckFunction(arr));
        sc.close();

    }   
    public static int CheckFunction(int[] arr){
        int max = -1;
        int smax = -1;
        int maxId =0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
                maxId = i;
            }
            else if(smax<arr[i]){
                smax = arr[i];
            }
        }
        if(max>=smax*2){
            return maxId;
        }
        else{
            return -1;
        }
    }
}
