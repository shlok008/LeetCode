class Solution 
{
    void cs(int cur,int[] c,int tar,List<Integer> l,List<List<Integer>> ds){
        if(tar<=0 || cur==c.length)
        {
            if(tar==0)
                ds.add(new ArrayList<>(l));
            return;
        }
        //if(c[cur]<=tar){
        l.add(c[cur]);
        cs(cur,c,tar-c[cur],l,ds);
        l.remove(l.size()-1);
        //}
        cs(cur+1,c,tar,l,ds);
    }
    public List<List<Integer>> combinationSum(int[] c, int tar) {
		List<List<Integer>> ans=new ArrayList<>();
        cs(0,c,tar,new ArrayList(),ans);
	    return ans;
	}
}

        
