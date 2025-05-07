
import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Container in the array");
        int n=sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the height of the container: ");
        for (int i = 0; i <n ; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Max Area of water is: ");
        System.out.println(maxArea(height));
        sc.close();
    }
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        int maxCap = 0;
        while(start<end){
            int h = Math.min(height[start],height[end]);
            int width = end - start;

            int CurCap = h * width;
            maxCap = Math.max(CurCap,maxCap);

            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxCap;

    }
}
