class Solution {
    public int shipWithinDays(int[] wt, int d) {
        int start=1;
        int end=30000000;
        //for(int i=1;i<wt.length;++i) end+=wt[i];
        int ans=Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int t=0;
            int sum=0;
            boolean f=false;
            for(int i=0;i<wt.length;++i) 
            {
                if(wt[i]>mid) {f=true;break;}
                if(wt[i]==mid){if(sum==0){t++;sum=0;continue;}else{t+=2;sum=wt[i];continue;}}

                sum+=wt[i];
                if(sum<mid) continue;
                else if(sum==mid && t+1<=d)
                {
                    t++;
                    sum=0;
                }
                else if(sum>mid && t+1<=d)
                {
                    t++;
                    sum=wt[i];
                }
                else break;
            }
            if(f){start=mid+1;continue;}
            if(sum>0)t++;
            if(t<=d){if(ans>mid)ans=mid; end=mid-1;}
            else start=mid+1;
        }
        return ans;
    }
}