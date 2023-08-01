class Solution {
    int rec(int ind,int prev,int[] num,int[][] dp)
    {
        if(ind==-1) return 0;
        int take=0;
        if(dp[ind+1][prev+1]!=-1) return dp[ind+1][prev+1];
        if(prev==-1|| num[ind]<num[prev] )take=1+rec(ind-1,ind,num,dp);
        int nottake=rec(ind-1,prev,num,dp);
        return dp[ind+1][prev+1]=Math.max(take,nottake);
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length+1][nums.length+1];
        for(int i[]:dp)Arrays.fill(i,-1);        
        return rec(nums.length-1,-1,nums,dp);
    }
}