/*
1        1
12      21
123    321
1234  4321
1234554321
 */

package Pattern;

public class pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int spaces = 2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            //spaces
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
}
