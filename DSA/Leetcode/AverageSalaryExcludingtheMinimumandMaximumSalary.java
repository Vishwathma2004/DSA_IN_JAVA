
import java.util.Scanner;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static double avgSalary(int[] salary){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        for(int s:salary){
            max = Math.max(max, s);
            min = Math.min(min, s);
            total +=s;
        }
        total = total-max - min;
        return (double)total/(salary.length-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of salary");
        int n = sc.nextInt();
        System.out.println("Enter the salary");
        int[] salary = new int[n];
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        System.out.println("Average salary excluding min and max is: ");
        System.out.println(avgSalary(salary));       
        sc.close(); 
    }
}
