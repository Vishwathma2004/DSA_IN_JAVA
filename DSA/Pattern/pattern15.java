package Pattern;

public class pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            char ch = (char) ('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
