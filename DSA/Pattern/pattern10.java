package Pattern;

public class pattern10 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int starts = 1;
        for(int i=0;i<n;i++){
            if(i%2==0) starts = 1;
            else starts = 0;
            for(int j=0;j<=i;j++){
                System.out.print(starts);
                starts=1-starts;
            }
            System.out.println();
        }
    }
}
