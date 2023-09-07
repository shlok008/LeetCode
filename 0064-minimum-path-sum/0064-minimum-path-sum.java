class Solution {
    int rec(int m,int n,int[][] grid,int[][] dp)
    {
        if(m==0 && n==0) return grid[0][0];
        if(dp[m][n]!=-1) return dp[m][n];
        int a=Integer.MAX_VALUE;
        if(m>0)a=rec(m-1,n,grid,dp);
        int b=Integer.MAX_VALUE;
        if(n>0)b=rec(m,n-1,grid,dp);
        return dp[m][n]=grid[m][n]+Math.min(a,b);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] i:dp)Arrays.fill(i,-1);
        return rec(grid.length-1,grid[0].length-1,grid,dp);
    }
}