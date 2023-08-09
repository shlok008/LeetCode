class Solution {
    public int findPeakElement(int[] num) {
        int start=0;
        int end=num.length-1;
        int ans=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if((mid==0 || num[mid-1]<num[mid]) && (mid==num.length-1 || num[mid]>num[mid+1])) return mid;
            if(mid==0 || num[mid-1]<num[mid]){ans=mid;start=mid+1;} 
            else{ans=mid; end=mid-1;}
        }
        return ans;
    }
}