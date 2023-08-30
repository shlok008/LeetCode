class Solution 
{
    void cs(int ind,int[] c,int tar,List<Integer> l,List<List<Integer>> ds){
        if(tar==0)
        {
            ds.add(new ArrayList<>(l));
            return;
        }
        if(ind==c.length || c[ind]>tar) return;
        for(int i=ind;i<c.length;++i)
        {
            if(i!=ind && c[i]==c[i-1]) continue;
            //if(c[ind]>tar) break;
            l.add(c[i]);
            cs(i+1,c,tar-c[i],l,ds);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] c, int tar) 
	{
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(c);
        cs(0,c,tar,new ArrayList(),ans);
	    return ans;
        
    }
}