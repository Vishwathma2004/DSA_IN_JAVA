// There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles 
// -from the market with one full water bottle.

//The operation of drinking a full water bottle turns it into an empty bottle.

//Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
//Input: numBottles = 9, numExchange = 3
//Output: 13
//Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
//Number of water bottles you can drink: 9 + 3 + 1 = 13

import java.util.Scanner;

public class Water_Bottle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of water bottles: ");
        int numBottles = sc.nextInt();
        System.out.println("Enter the number of bottles for Exchange");
        int numExchange = sc.nextInt();
        System.out.println(numWaterBottles(numBottles, numExchange));
        sc.close();
    }
    static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int newBottle = numBottles/numExchange;
            int remBottle = numBottles % numExchange ;
            ans +=newBottle;
            numBottles = newBottle + remBottle; 
        }
        return ans;
    }
}