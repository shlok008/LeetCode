class Solution {
    public int longestCommonSubsequence(String m, String n) {
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
        System.gc();
        return dp[dp.length-1][dp[0].length-1];
    }
}