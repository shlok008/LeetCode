class Solution {
    int rec(int ind,int[] p, int cart,int[][][] dp,int tran)
    {
        if(ind==p.length || tran==0) return 0;
        if(dp[ind][cart][tran]!=-1) return dp[ind][cart][tran];
        int take,nottake;
        if(cart==0)
        {
            take =-p[ind] +rec(ind+1,p,1,dp,tran);
            nottake=rec(ind+1,p,0,dp,tran);
        }
        else
        {
            take=p[ind]+rec(ind+1,p,0,dp,tran-1);
            nottake=rec(ind+1,p,1,dp,tran);
        }
        return dp[ind][cart][tran]=Math.max(take,nottake);
    }
    public int maxProfit(int[] p) {
        int dp[][][]=new int[p.length][2][3];
        for(int i[][]:dp) for(int[] j:i)Arrays.fill(j,-1);
        return rec(0,p,0,dp,2);
    }
}