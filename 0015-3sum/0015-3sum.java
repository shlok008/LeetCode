class Solution {
    public List<List<Integer>> threeSum(int[] n) {

        /*for(int p=0;p<n.length;++p)
        {
            int i=0;
            int j=n.length-1;
            while(j>=i)
            {
                if(i<n.length && n[i]<=n[p])i++;
                else if(j>0 && n[j]>=n[p])j--;
                else
                {
                    int t=n[j];
                    n[j]=n[i];
                    n[i]=t;
                }
            }
            int t=n[j];
            n[j]=n[p];
            n[p]=t;
        }*/ Arrays.sort(n);
        List<List<Integer>> ans=new ArrayList();
        for(int i=0;i<n.length-2;++i)
        {
            if(i>0 && n[i-1]==n[i])continue;
            int j=i+1;
            int k=n.length-1;
            while(j<k)
            {
                if(n[i]+n[j]+n[k]<0) j++;
                else if(n[i]+n[j]+n[k]>0) k--;
                else 
                {
                    ans.add(Arrays.asList(n[i],n[j],n[k]));
                    while(j<k && n[j]==n[j+1]) j++;
                    while(j<k && n[k]==n[k-1]) k--;
                    j++;
                    k--;
                }
                
            }
        }
        return ans;
    }
}
