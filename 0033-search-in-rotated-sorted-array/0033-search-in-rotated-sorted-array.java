class Solution {
    public int search(int[] num, int tar) {
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(num[mid]==tar)
                return mid;
            else if(num[start]<=num[mid]) 
            {
                if(tar<num[start] || tar>num[mid]) start=mid+1;
                else end=mid-1;
            }
            else
            {
                if(tar<num[mid] || tar>num[end] ) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }
}