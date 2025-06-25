public class AddBinary {
    static String addBinary(String a,String b){
        int sum =0;
        int carry =0;
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 || j>=0 || carry==1){
            sum=carry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            sb.append(sum);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }
    
}
