class Solution {
    int rec(int ind,int[] p, int cart,int[][] dp,int fe)
    {
        if(ind==p.length) return 0;
        if(dp[ind][cart]!=-1) return dp[ind][cart];
        int take,nottake;
        if(cart==0)
        {
            take =-p[ind] +rec(ind+1,p,1,dp,fe);
            nottake=rec(ind+1,p,0,dp,fe);
        }
        else
        {
            take=p[ind]-fe+rec(ind+1,p,0,dp,fe);
            nottake=rec(ind+1,p,1,dp,fe);
        }
        return dp[ind][cart]=Math.max(take,nottake);
    }
    public int maxProfit(int[] p, int fee) {
        int[][] dp=new int[p.length][2];
        for(int[] i:dp) Arrays.fill(i,-1);
        return rec(0,p,0,dp,fee);
    }
}