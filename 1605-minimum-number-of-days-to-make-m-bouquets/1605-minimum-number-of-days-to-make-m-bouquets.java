class Solution {
    public int minDays(int[] bd, int m, int k) {
        int end=bd[0];
        for(int i=1;i<bd.length;++i) if(end<bd[i])end=bd[i];
        int start=0;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int c=0;
            int t=0;
            for(int j=0;j<bd.length;++j)
            {
                if(bd[j]-mid<=0) 
                {
                    c++;
                    if(k==c)
                    {
                        t++;
                        if(t==m) {ans=mid; break;}
                        c=0;
                    }
                }
                else {if(bd.length-k<j)break;c=0;}
            }
            if(ans==mid) end=mid-1;
            else start=mid+1;
        }
        return ans;
    }
}