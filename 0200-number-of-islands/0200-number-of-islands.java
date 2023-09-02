class Solution {
    void dfs(char[][] grid,boolean vis[][],int i,int j)
    {
        vis[i][j]=true;
        if(j<grid[0].length-1 && grid[i][j+1]=='1' && !vis[i][j+1])
            dfs(grid,vis,i,j+1);
        if(j>0 && grid[i][j-1]=='1' && !vis[i][j-1])
            dfs(grid,vis,i,j-1);
        if(i<grid.length-1 && grid[i+1][j]=='1' && !vis[i+1][j]) 
            dfs(grid,vis,i+1,j);
        if(i>0 && grid[i-1][j]=='1' && !vis[i-1][j]) 
            dfs(grid,vis,i-1,j);
        
    }
    public int numIslands(char[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;++i)
        {
            for(int j=0;j<grid[i].length;++j)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    ans++;
                    dfs(grid,vis,i,j);
                }
            }
        }
        return ans;
    }
}