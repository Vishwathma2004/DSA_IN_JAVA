import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int target=22; 
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] array,int target){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            //int mid=(left+right)/2; there is possibility that start+end may exceed the range of integer
            int mid = left + (right - left) / 2;
            if(target<array[mid]){
                right=mid-1;
            }

            else if(target>array[mid]){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
