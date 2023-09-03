class Solution 
{
    boolean rec(int ind,int[] l,int []ms,int s)
    {
        if(ind==-1) return true;
        for(int i=0;i<4;++i)
        {
            if(l[i]+ms[ind]>s||(i>0&&l[i]==l[i-1]))continue;
            
            l[i]+=ms[ind]; 
            if(rec(ind-1,l,ms,s)) 
                return true;
            l[i]-=ms[ind];
            
        }
        return false;
    }
    public boolean makesquare(int[] ms) 
    {
        int s=0;
        for(int i:ms)s+=i;
        return rec(ms.length-1,new int[4],ms,s/4);
    }
}