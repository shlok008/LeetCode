class Solution {
    public int rec(int ind,int[] n,int[] dp)
    {
        if(ind==0)return n[ind];
        if(ind==1)return Math.max(n[ind],n[ind-1]);
        if(dp[ind]!=-1)return dp[ind];
        return dp[ind]=Math.max(n[ind]+rec(ind-2,n,dp),rec(ind-1,n,dp));
    }
    public int rob(int[] num) {
        int[] dp=new int[num.length+1];
        Arrays.fill(dp,-1);
        return rec(num.length-1,num,dp);
    }
}