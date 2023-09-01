class Solution {
    /*void rec(int sum,int ind,List<Integer> l,int[]n, int k)
    {
        if(k==sum){System.out.print(l);return;}
        if(ind==n.length)return;
        l.add(n[ind]);
        rec(sum+n[ind],ind+1,l,n,k);
        l.remove(l.size()-1);
        rec(sum,ind+1,l,n,k);
    }*/
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