package MoveAllNegativeAndPositiveToOppositeSide;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortPartition {
    static int [] move(int[] arr){
        int j =0 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}
