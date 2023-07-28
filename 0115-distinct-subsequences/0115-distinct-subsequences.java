class Solution {
    int rec(int a,int b,String m,String n,int[][] dp)
    {
        if(b==0) return 1;
        if(a==0) return 0;
        if(dp[a][b]!=-1)return dp[a][b];
        int take=0;
        if(m.charAt(a-1)==n.charAt(b-1)) take= rec(a-1,b-1,m,n,dp);
        int nottake=rec(a-1,b,m,n,dp);
        return dp[a][b]= take+nottake;
    }
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return rec(dp.length-1,dp[0].length-1,s,t,dp);
    }
}