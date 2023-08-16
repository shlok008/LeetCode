class Solution {
    public int findKthPositive(int[] arr, int k) {
        //if(arr[arr.length-1]==arr.length) return arr[arr.length-1]+k;
        //if(arr[0]>k) return k;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]-mid-1<k) start=mid+1;
            else end=mid-1;
        }
        //System.out.println(start);
        //System.out.println(end);
        //if(end==-1) return arr[start]+k;
        return end+1+k;
    }
}