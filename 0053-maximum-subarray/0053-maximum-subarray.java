class Solution {
    public int maxSubArray(int[] n) {
        int s=0;
        int max=n[0];

        for(int i=0;i<n.length;++i)
        {
            s+=n[i];
            if(max<s)max=s;
            if(s<0)s=0;
        }
        return max;
    }
}