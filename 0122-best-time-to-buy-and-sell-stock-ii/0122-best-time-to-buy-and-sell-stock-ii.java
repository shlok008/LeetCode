class Solution {
    public int maxProfit(int[] p) 
    {
        int pro=0;
        for(short i=1;i<p.length;++i)
            if(p[i-1]<p[i])pro+=p[i]-p[i-1];
        return pro;
    }
}
