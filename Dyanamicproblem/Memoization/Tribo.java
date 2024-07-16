package Dyanamicproblem.Memoization;

import java.util.Arrays;

public class Tribo {
    public static void main(String[] args) {
        int n=25;
        int dp []=new int[n+1];
        Arrays.fill(dp, -1);
       
        System.out.println(solve(n, dp));
    }

    public static int solve(int n,int [] dp){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
if(dp[n]!=-1){
    return dp[n];
}
        int a=solve(n-1,dp);
        int b=solve(n-2, dp);
        int c=solve(n-3, dp);

        return dp[n]=a+b+c;
    }
}
