class Solution {
    void per(boolean flag[],int []nums,List<Integer> l,List<List<Integer>> ds)
    {
        if(l.size()==nums.length)
        {
            ds.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;++i)
        {
            if(!flag[i]) 
            {
                //if(i!=0 && nums[i]==nums[i-1]) continue;
                flag[i]=true;
                l.add(nums[i]);
                per(flag,nums,l,ds);
                l.remove(l.size()-1);
                flag[i]=false;
            }   
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean flag[]=new boolean[nums.length];
        per(flag,nums,new ArrayList<>(),ans);
        System.gc();
        return ans;
    }
}