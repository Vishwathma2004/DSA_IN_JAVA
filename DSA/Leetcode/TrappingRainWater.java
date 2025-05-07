//https://leetcode.com/problems/trapping-rain-water/description/
//42. Trapping Rain Water

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it can trap after raining.



import java.util.Scanner;

public class TrappingRainWater {
    public static int trap(int[] height){
        int n = height.length-1;
        int l = 0, r = n;

        int leftMax = height[l];
        int rightMax = height[r];
        int ans = 0;
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                ans+=leftMax-height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                ans+=rightMax - height[r];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bar");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the height of each bar");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        int res =trap(height);
        System.out.println("The water it can trap is: "+res); 
        sc.close();
    }
}
