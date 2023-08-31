class Solution {
    void rec(int sum,int ind,int k,int n,List<Integer> l,List<List<Integer>> ans)
    {
        if(k==0){if(sum==n)ans.add(new ArrayList(l));else return;}
        if(ind==10 || sum>n) return;
        if(sum+ind<=n)
        {l.add(ind);rec(sum+ind,ind+1,k-1,n,l,ans);l.remove(l.size()-1);
        rec(sum,ind+1,k,n,l,ans);}
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,1,k,n,new ArrayList(),ans);
        return ans;
    }

}