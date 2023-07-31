class Solution {
    int rec(int ind,int[] p, int cart,int[][] dp)
    {
        if(ind>=p.length) return 0;
        if(dp[ind][cart]!=-1) return dp[ind][cart];
        int take,nottake;
        if(cart==0)
        {
            take =-p[ind] +rec(ind+1,p,1,dp);
            nottake=rec(ind+1,p,0,dp);
        }
        else
        {
            take=p[ind]+rec(ind+2,p,0,dp);
            nottake=rec(ind+1,p,1,dp);
        }
        return dp[ind][cart]=Math.max(take,nottake);
    }
    public int maxProfit(int[] p) {
        int[][] dp=new int[p.length][2];
        for(int[] i:dp) Arrays.fill(i,-1);
        return rec(0,p,0,dp);
    }
}