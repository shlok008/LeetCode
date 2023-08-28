class Solution {
    public void setZeroes(int[][] m) {
        boolean rz=false;
        
        for(int i=0;i<m.length;++i)
        {
            for(int j=0;j<m[0].length;++j)
            {
                if(m[i][j]==0)
                {
                    if(i==0) rz=true;
                    else {m[i][0]=0;m[0][j]=0;} 
                }
            }
        }
        
        for(int i=0;i<m.length;++i)
        {
            for(int j=0;j<m[0].length;++j)
            {
                if(i==0 || j==0) continue;
                if(m[i][0]==0 || m[0][j]==0)m[i][j]=0; 
            }
        }
        
        if(m[0][0]==0)
            for(int i=0;i<m.length;++i) m[i][0]=0;
        if(rz)
            for(int j=0;j<m[0].length;++j) m[0][j]=0;
        
    }
}