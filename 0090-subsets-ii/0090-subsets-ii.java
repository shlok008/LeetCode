class Solution {
    void cs(int ind,int[] c,List<Integer> l,List<List<Integer>> ds){
        ds.add(new ArrayList<>(l));
        for(int i=ind;i<c.length;++i)
        {
            if(i!=ind && c[i]==c[i-1]) continue;
            l.add(c[i]);
            cs(i+1,c,l,ds);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] num) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(num);
        cs(0,num,new ArrayList(),ans);
	    return ans;
    }
}

