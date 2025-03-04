//https://leetcode.com/problems/bulb-switcher/description/

//319. Bulb Switcher
//There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
//On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
//Return the number of bulbs that are on after n rounds.

import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bulb: ");
        int n = sc.nextInt();
        System.out.println("No of bulb which is ON");
        System.out.println(bulbSwitch(n));
        sc.close();
    }
    public static int bulbSwitch(int n){
        int counter = 0;
        int i=1;
        while(i*i<=n){
            counter++;
            i++;
        }
        return counter;
    }
}
