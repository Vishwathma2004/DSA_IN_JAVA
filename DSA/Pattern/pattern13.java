/*
A 
A B
A B C
A B C D
A B C D E
 */
package Pattern;

public class pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
