class Solution {
    int rec(int start,int end,int tar,int[] num)
    {
        if(end<start) return -1;
        int mid=(start+end)/2;
        if(tar==num[mid]) return mid;
        if(tar>num[mid]) return rec(mid+1,end,tar,num);
        return rec(start,mid-1,tar,num);
    }
    public int search(int[] nums, int tar) {
        return rec(0,nums.length-1,tar,nums);
    }
}