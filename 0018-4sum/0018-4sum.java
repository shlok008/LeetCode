class Solution {
    public List<List<Integer>> fourSum(int[] n, int tar) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(n);
        int i=0;
        while(i<n.length-3)
        {
            int j=i+1;
            while(j<n.length-2)
            {
                int l=j+1;
                int r=n.length-1;
                while(l<r)
                {
                    long s=n[i];
                    s+=n[j];
                    s+=n[l];
                    s+=n[r];
                    if(s==tar)
                    {
                        ans.add(Arrays.asList(n[i],n[j],n[l],n[r]));l++;r--;
                        while(l<r && n[l]==n[l-1])l++;
                        while(l<r && n[r]==n[r+1])r--;
                    }
                    else if(n[i]+n[j]+n[l]+n[r]>tar) r--;
                    else l++;
                }
                j++;
                while(j<n.length && n[j]==n[j-1])j++;
            }
            i++;
            while(i<n.length && n[i]==n[i-1])i++;
        }
        return ans;
    }
}
