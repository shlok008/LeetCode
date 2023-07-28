class Solution {
    int rec(int i,int j,String m,String n,int[][] dp)
    {
        if(i==0)return j;
        if(j==0)return i;
        if(m.charAt(i-1)==n.charAt(j-1)) return rec(i-1,j-1,m,n,dp);
        if(dp[i][j]!=-1)return dp[i][j];
        int ins=1+rec(i,j-1,m,n,dp);
        int del=1+rec(i-1,j,m,n,dp);
        int rep=1+rec(i-1,j-1,m,n,dp);
        return dp[i][j]=Math.min(ins,Math.min(del,rep)); 
    }
    public int minDistance(String m, String n) {
        if(n.length()==0)return m.length();
        if(m.length()==0)return n.length();
        int dp[][]=new int[m.length()+1][n.length()+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return rec(dp.length-1,dp[0].length-1,m,n,dp);
    }
}