class Solution {
    public String shortestCommonSupersequence(String m, String n) {
        int[][] dp=new int[m.length()+1][n.length()+1];
        
        for(int i=0;i<dp.length;++i) dp[i][0]=0;
        for(int i=0;i<dp[0].length;++i) dp[0][i]=0;
        
        for(int i=1;i<dp.length;++i)
        {
            for(int j=1;j<dp[0].length;++j)
            {
                if(m.charAt(i-1)==n.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        StringBuilder s=new StringBuilder();
        int a=dp.length-1;
        int b=dp[0].length-1;
        while(a>0 && b>0)
        {
            if(m.charAt(a-1)==n.charAt(b-1)) {s.append(n.charAt(b-1));a--;b--;}
            else if(dp[a][b-1]>dp[a-1][b]){s.append(n.charAt(b-1));b--;}
            else{s.append(m.charAt(a-1));a--;}
        }
        while(a>0){
            s.append(m.charAt(a-1));
            a--;
        }
        while(b>0){
            s.append(n.charAt(b-1));
            b--;
        }
        System.gc();
        return s.reverse().toString();
    }
}