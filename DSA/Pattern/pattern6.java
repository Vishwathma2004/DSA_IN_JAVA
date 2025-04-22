/*
* * * * * * 
* * * * *
* * * *
* * *
* *
*
 */
package Pattern;

public class pattern6 {
    public static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
