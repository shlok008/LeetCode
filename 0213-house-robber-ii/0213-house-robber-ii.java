class Solution {
    int rec(int s,int e,int[] n,int[]dp)
    {
        if(s==e) return n[s];
        if(s==e-1) return Math.max(n[e],n[e-1]);
        if(dp[s]!=-1)return dp[s];
        return dp[s]=Math.max(n[s]+rec(s+2,e,n,dp),rec(s+1,e,n,dp));
    }
    public int rob(int[] num){
        if(num.length==1) return num[0];
        int[] dp=new int[num.length+1];
        Arrays.fill(dp,-1);
        int a=rec(0,num.length-2,num,dp);
        Arrays.fill(dp,-1);
        return Math.max(a,rec(1,num.length-1,num,dp));
    }
}