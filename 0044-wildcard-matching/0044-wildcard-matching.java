class Solution {
    int rec(int i,int j,String m,String n,int[][] dp)
    {
        if(i==-1 && j==-1) return 1;
        if(i!=-1 && j==-1) return -1;

        if(i==-1 && j>-1) 
        {
            if(n.charAt(j)!='*') 
                return -1;
            else
                return rec(i,j-1,m,n,dp);
        }
        
        if(dp[i][j]!=0) return dp[i][j];

        if(n.charAt(j)=='?' || m.charAt(i)==n.charAt(j))
           return dp[i][j]=rec(i-1,j-1,m,n,dp);
        
        if(n.charAt(j)=='*') 
        {
            if(rec(i,j-1,m,n,dp)==1 || rec(i-1,j,m,n,dp)==1) return dp[i][j]=1;
            else return dp[i][j]=-1;
        }

        return dp[i][j]=-1;
    }
    public boolean isMatch(String m, String n) {
        if(m.length()==0 && n.length()==0)return true;
        else if(m.length()==0) 
        {
            int l=n.length();
            while(l!=0){
                if(n.charAt(l-1)!='*')return false;
                l--;}
            return true;    
        }
        else if(n.length()==0) return false;
        int[][] dp=new int[m.length()][n.length()];
        return (rec(dp.length-1,dp[0].length-1,m,n,dp)==1);
    }
}