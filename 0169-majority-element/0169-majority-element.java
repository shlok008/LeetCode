class Solution {
    public int majorityElement(int[] n) {
        int el=-1;
        int cnt=0;
        for(int i=0;i<n.length;++i)
        {
            if(cnt==0) {el=n[i];cnt++;}
            else if(n[i]==el) cnt++;
            else cnt--;
        }
        return el;
    }
}