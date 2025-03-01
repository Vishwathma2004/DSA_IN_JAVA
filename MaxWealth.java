//1672 -  https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String args[]){
        int[][] accounts={{1,2,3},{3,2,1}};
        MaxWealth maxWealth=new MaxWealth();
        int ans=maxWealth.maximumWealth(accounts);
        System.out.println(ans);
    }
    public int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            //now we have sum of account of person
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
