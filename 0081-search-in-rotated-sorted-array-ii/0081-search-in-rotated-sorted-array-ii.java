class Solution {
    public boolean search(int[] num, int tar) {
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(num[mid]==tar)
                return true;
            else if(num[start]==num[mid] && num[mid]==num[end])
            {
                start++;
                end--;
            }
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
        return false;
    }
}