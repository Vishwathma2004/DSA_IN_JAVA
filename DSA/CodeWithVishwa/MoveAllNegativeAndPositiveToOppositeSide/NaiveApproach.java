package MoveAllNegativeAndPositiveToOppositeSide;

import java.util.Arrays;
import java.util.Scanner;

public class NaiveApproach {
    static int[] move(int[] arr){
        Arrays.sort(arr);
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
        int[] ans = move(arr);
        System.out.println(Arrays.toString(ans));
    }

}
