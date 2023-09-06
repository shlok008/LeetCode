class Solution {
    int rec(int m,int n,int[][] obs,int[][] dp)
    {
        if(m<0||n<0||obs[m][n]==1) return 0;
        if(m==0 && n==0)return 1;
        if(dp[m][n]!=-1)return dp[m][n];
        return dp[m][n]=rec(m-1,n,obs,dp)+rec(m,n-1,obs,dp);
    }
    public int uniquePathsWithObstacles(int[][] obs) 
    {
        //if(obs[0][0]==1||obs[obs.length-1][obs[0].length-1]==1)return 0;
        int[][] dp=new int[obs.length+1][obs[0].length+1];
        for(int[] i:dp)Arrays.fill(i,-1);
        return rec(obs.length-1,obs[0].length-1,obs,dp);
    }
}