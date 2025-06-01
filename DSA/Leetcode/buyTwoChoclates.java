import java.util.Scanner;

public class buyTwoChoclates{
    public static int buyChoco(int[] prices,int money){
        if(prices.length==0){
            return 0;
        }
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        int totalCost = 0;
        for(int price:prices){
            if(price<minFirst){
                minSecond = minFirst;
                minFirst = price;
            }
            else if(price<minSecond){
                minSecond = price;
            }
        }
        totalCost = minFirst + minSecond;
        if(money>=totalCost){
            return money - totalCost;
        }
        else{
            return money;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Choclates: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices: ");
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        System.out.println("Enter the money: ");
        int money = sc.nextInt();
        System.out.println("amount of money you will have leftover after buying the two chocolates:");
        System.out.println(buyChoco(prices,money));
        sc.close();
    }
}