class Solution {
    int rec(int n,int[] dp)
    {
        if(n==1||n==2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=rec(n-1,dp)+rec(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n,dp);
    }
        /*if(n==1) return 1;
        if(n==2)return 2;
        int dp[]=new int[n+1];
        for(int i:dp) i=-1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<n+1;++i)  dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }*/
}