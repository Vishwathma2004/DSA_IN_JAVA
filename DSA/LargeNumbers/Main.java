package LargeNumbers;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 33;
        int b =40;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(33);
        BigInteger C = BigInteger.TEN;
        BigInteger sub = B.subtract(C);
        System.out.println("Minus is "+sub);
        BigInteger remain = B.remainder(C);
        System.out.println("Reaminder is "+remain);
        System.out.println("");
        if(C.compareTo(A)<0){
            System.out.println("Yes");
        }
        BigInteger s = A.add(C);
        System.out.println(s);
        System.out.println(Factorial.fact(3));
        BD();
    }
    static void BD(){
        double x = 0.02;
        double y = 0.04;
        double sub = y-x;
        System.out.println(sub);

        BigDecimal X = new BigDecimal("0.04");
        BigDecimal Y = new BigDecimal("0.05");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);
    }
}
