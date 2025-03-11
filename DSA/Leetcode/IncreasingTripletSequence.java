package Leetcode;
import java.util.Scanner;

public class IncreasingTripletSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(triplet(arr));
        sc.close();
    }   
    public static boolean triplet(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(first>=ele){
                first = ele;
            }
            else if(second>=ele){
                second = ele;
            }
            else{
                return true;
            }
        }
        return false;
    } 
}
