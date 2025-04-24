package Pattern;

public class pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<=(n-i-1)+'A';j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
