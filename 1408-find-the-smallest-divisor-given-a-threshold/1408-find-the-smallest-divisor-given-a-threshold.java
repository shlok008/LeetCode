class Solution {
    public int smallestDivisor(int[] num, int th) {
        int start=1;
        int end=1000000;
        int ans=1000;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int sum=0;
            for(int i=0;i<num.length;++i) {sum+=(num[i] + mid - 1) / mid;if(sum>th)break;}
            if(sum<=th) {ans=mid;end=mid-1;}
            else start=mid+1;
        }
        return ans;
    }
}