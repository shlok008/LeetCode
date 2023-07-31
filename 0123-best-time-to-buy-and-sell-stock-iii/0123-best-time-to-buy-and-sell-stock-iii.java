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
        int dp[][][]=new int[p.length+1][2][3];
        //for(int i[][]:dp) for(int[] j:i)Arrays.fill(j,-1);
        for(int ind=p.length-1;ind>=0;--ind)
        {
            for(int cart=1;cart>=0;--cart)
            {
                for(int tran=1;tran<=2;++tran)
                {
                    int take,nottake;
                    if(cart==0)
                    {
                        take =-p[ind] +dp[ind+1][1][tran];
                        nottake=dp[ind+1][0][tran];
                    }
                    else
                    {
                        take=p[ind]+dp[ind+1][0][tran-1];
                        nottake=dp[ind+1][1][tran];
                    }
                    dp[ind][cart][tran]=Math.max(take,nottake);
                }
            }
        }
        return dp[0][0][2];
    }
}