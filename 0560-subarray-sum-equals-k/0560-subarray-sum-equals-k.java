class Solution {

    public int subarraySum(int[] n, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0;
        int ans=0;
        hm.put(0,1);
        for(int i=0;i<n.length;++i)
        {
            s+=n[i];
            if(hm.containsKey(s-k)) ans+=hm.get(s-k);
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return ans;
    }
}