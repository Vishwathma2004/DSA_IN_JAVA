/*
*
**
***
****
*****
****
***
**
*
 */
package Pattern;

public class pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    public static void pattern9(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
