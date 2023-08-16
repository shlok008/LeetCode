class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr[arr.length-1]==arr.length) return arr[arr.length-1]+k;
        if(arr[0]>k) return k;
        int ans=k;

        for(int i=0;i<arr.length;++i)
        {
            if(arr[i]<=ans)ans++;
            else break;
        }

        return ans;

        /*
        if(arr[arr.length-1]==arr.length) return arr[arr.length-1]+k;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid==start || mid==end) break;
            if(arr[mid]-mid-1<k) start=mid+1;
            else end=mid-1;
        }
        return arr[start]-start+k;
        */
    }
}