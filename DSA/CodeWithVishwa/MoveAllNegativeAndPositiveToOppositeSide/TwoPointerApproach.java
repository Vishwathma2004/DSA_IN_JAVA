package MoveAllNegativeAndPositiveToOppositeSide;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerApproach {
    static int[] move(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(left<right && arr[left]<0){
                left++;
            }
            while(right>left && arr[right]>0){
                right--;
            }
            while(right>left){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
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
