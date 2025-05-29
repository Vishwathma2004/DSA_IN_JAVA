//https://leetcode.com/problems/find-the-town-judge/description/?envType=problem-list-v2&envId=array
/*
997. Find the Town Judge
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 */
import java.util.Scanner;

public class findTheTownJudge {
    public static int findJudge(int n,int[][] trust){
        int[] indegree = new int[n+1];
        int[] outdegree = new int[n+1];
        for(int[] vec:trust){
            int a = vec[0];    //person who trust
            int b = vec[1];    //person is trusted by other
            indegree[a]++;     //person a's indegree should be increased
            outdegree[b]++;    //person b's outdegree should be increased
        }
        for(int i=1;i<=n;i++){
            if(indegree[i]==n-1 && outdegree[i]==0){        
                return i;                               
            }
        }
    return -1;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] trust = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                trust[i][j] = sc.nextInt();
            }
        }
        System.out.println(findJudge(n,trust));
        sc.close();
    }
}
