//https://leetcode.com/problems/boats-to-save-people/description/
//881. Boats to Save People
//You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

//Return the minimum number of boats to carry every given person.



import java.util.Arrays;
import java.util.Scanner;

public class BoatsToSavePeople {
    public static int numberOfBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int boats = 0;
        int right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for array size
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[] people = new int[n];
        System.out.println("Enter the weights of the people:");
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        // Take input for weight limit
        System.out.print("Enter the boat weight limit: ");
        int limit = sc.nextInt();

        // Call the method and display result
        int result = numberOfBoats(people, limit);
        System.out.println("Minimum number of boats required: " + result);

        sc.close();
    }
}
