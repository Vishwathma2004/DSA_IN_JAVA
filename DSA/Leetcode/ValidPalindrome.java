import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s = s.toLowerCase();
        
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
            }
            while(i<j&& !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}
