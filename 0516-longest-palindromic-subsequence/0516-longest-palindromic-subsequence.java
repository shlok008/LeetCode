class Solution {
    /*int rec(int i,int j,String m,String n,int[][] dp)
    {
        if(i==0 || j==0) return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(m.charAt(i-1)==(n.charAt(j-1))) return 1+rec(i-1,j-1,m,n,dp);
        return dp[i][j]=Math.max(rec(i-1,j,m,n,dp),rec(i,j-1,m,n,dp)); 
    }*/
    public int longestPalindromeSubseq(String m) {
        String n="";
        for(int i=m.length()-1;i>=0;--i)
        {
            n+=m.charAt(i);
        }
        int[][] dp=new int[m.length()+1][n.length()+1];

        for(int i=0;i<=n.length();++i) dp[0][i]=0;
        for(int j=0;j<=m.length();++j) dp[j][0]=0;

        for(int i=1;i<dp.length;++i)
        {
            for(int j=1;j<dp[0].length;++j)
            {
                if(m.charAt(i-1)==(n.charAt(j-1))) 
                    dp[i][j]=1+dp[i-1][j-1];
                else 
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}