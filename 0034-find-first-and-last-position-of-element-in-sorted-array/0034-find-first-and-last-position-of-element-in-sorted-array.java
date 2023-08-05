class Solution {

    public int[] searchRange(int[] num, int tar) {
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        int end=num.length-1;
        int start=0;
        while(end>=start)
        {
            int mid=(start+end)/2;
            if(tar==num[mid]) {ans[0]=mid;end=mid-1;}
            else if(tar>num[mid]) start=mid+1;
            else end=mid-1;
        }
        if(ans[0]==-1) return ans;
        start=ans[0];
        end=num.length-1;
        while(end>=start)
        {
            int mid=(start+end)/2;
            if(tar==num[mid]) {ans[1]=mid;start=mid+1;}
            else if(tar>num[mid]) start=mid+1;
            else end=mid-1;
        }
        return ans;
    }
}