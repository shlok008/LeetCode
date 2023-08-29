class Solution {
    public int subarraySum(int[] n, int k) {
        int c=0;
        for(int i=0;i<n.length;++i)
        {
            int j=i;
            int s=0;
            while(j<n.length)
            {
                s+=n[j];
                if(s==k) c++;
                j++;
            }
        }
        return c;
    }
}