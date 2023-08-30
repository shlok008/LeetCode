class Solution {
    void rec(List<List<Integer>> ans,int[] a,List<Integer> l,int ind)
    {
        if(ind==a.length) {ans.add(new ArrayList(l));return;}
        l.add(a[ind]);
        rec(ans,a,l,ind+1);
        l.remove(l.size()-1);
        rec(ans,a,l,ind+1);
    }
    public List<List<Integer>> subsets(int[] num) {
        List<List<Integer>> ans=new ArrayList();
        rec(ans,num,new ArrayList(),0);
        return ans;
    }
}
        /*for(int i=0;i<(1<<num.length);++i)
        {
            ans.add(new ArrayList());
            for(int j=0;j<num.length;++j)
            {
                if((i&(1<<j))!=0) ans.get(i).add(num[j]);
            }
        }*/