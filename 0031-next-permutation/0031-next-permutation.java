class Solution {
    public int[] nextPermutation(int[] n) {
        int a=n.length-1;
        while(a>0 && n[a-1]>=n[a])a--;
        if(a!=0)
        {
            int start=a;
            int end=n.length-1;
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(n[mid]>n[a-1]) start=mid+1;
                else end=mid-1;
            }
            n[a-1]+=n[end];
            n[end]=n[a-1]-n[end];
            n[a-1]=n[a-1]-n[end];
        }
        for(int i=a;i<n.length;++i)
        {
            int t=i;
            for(int j=i+1;j<n.length;++j)
            {if(n[j]<n[t])t=j;}
            int b=n[i];
            n[i]=n[t];
            n[t]=b;
        }
        System.gc();
        return n;
    }
}