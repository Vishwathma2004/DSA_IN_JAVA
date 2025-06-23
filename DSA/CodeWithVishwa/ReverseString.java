import java.lang.*;
import java.util.*;
public class ReverseString {
    static String reversal(String s){
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("The reversed string is:");
        System.out.println(reversal(s));
        sc.close();
    }
}
