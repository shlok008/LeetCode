class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int end=p[0];
        for(int i=1;i<p.length;++i) if(end<p[i])end=p[i];
        int start=1;
        int a=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int ans=0;
            for(int i=0;i<p.length;++i) ans+=Math.ceil(p[i]*1.0/mid);
            if(ans<=h) {a=mid;end=mid-1;}
            else {start=mid+1;}
        }
        return a;
    }
}
