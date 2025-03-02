import java.util.Scanner;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String args[]){
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            // Calculate the mid index safely to avoid overflow
            int mid = left + (right - left) / 2;
            if (target < letters[mid]) {
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return letters[left%letters.length];  // If target is not found, return the index where the target could be inserted
    }
}
