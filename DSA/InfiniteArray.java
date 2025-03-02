import java.util.Scanner;
public class InfiniteArray{
    public static void main(String arg[]){
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));;
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=0;
        while(target>arr[end]){
            int newStart=end+1;
            //double the box value
            end=end+2*(end-start+1);
            start=newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] numbers, int target,int start,int end) {
        while (start <= end) {
            // Calculate the mid index safely to avoid overflow
            int mid = start + (end - start) / 2;
            if (target < numbers[mid]) {
                end = mid - 1;
            } else if(target>numbers[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;  // If target is not found, return the index where the target could be inserted
    }
}