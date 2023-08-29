class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> ans=new ArrayList<>();
        int l=0,r=m[0].length-1;
        int t=0,b=m.length-1;
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;++i) ans.add(m[t][i]);
            t++;
            for(int i=t;i<=b;++i) ans.add(m[i][r]);
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;--i) ans.add(m[b][i]);
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;--i) ans.add(m[i][l]);
                l++;
            }
        }
        return ans;
    }
}
