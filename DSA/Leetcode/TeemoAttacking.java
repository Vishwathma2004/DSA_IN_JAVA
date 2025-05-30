//https://leetcode.com/problems/teemo-attacking/description/?envType=problem-list-v2&envId=array
/*
495. Teemo Attacking
Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.

You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.

Return the total number of seconds that Ashe is poisoned.
 */
import java.util.Scanner;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration){
        if(timeSeries.length ==0){
            return 0;
        }
        int total = duration;
        for(int i=0;i<timeSeries.length-1;i++){
            total+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the TimeSeries");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Duration:");
        int duration = sc.nextInt();
        TeemoAttacking obj = new TeemoAttacking();
        System.out.println("Teemo's attacks on Ashe:");
        System.out.println(obj.findPoisonedDuration(arr,duration));     
        sc.close();
    }

}
