class Solution {
    void dfs(int ind,int[] ans, int[] c)
    {
        if(ind==ans.length)
        {
            c[0]++;
            return;
        }
        for(int i=0;i<ans.length;++i)
        {
            boolean flag=false;
            for(int j=0;j<ind;++j)
            {
                if(ans[j]==i || Math.abs(ans[j]-i)==Math.abs(ind-j))
                {flag=true;break;}
            }
            if(flag==false)
            {ans[ind]=i;
            dfs(ind+1,ans,c);}
        }
    }
    public int totalNQueens(int n) {
        int count[]=new int[1]; 
        dfs(0,new int[n],count);
        return count[0];
    }
}