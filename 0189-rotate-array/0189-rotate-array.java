class Solution {
    void rev(int[] arr,int start, int end)
    {
        while(start<end)
        {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
    }
    public int[] rotate(int[] no, int k) {
        k%=no.length;
        //rev(no,0,no.length-1);
        //rev(no,0,k-1);
        //rev(no,k,no.length-1);
        rev(no,0,no.length-k-1);
        rev(no,no.length-k,no.length-1);
        rev(no,0,no.length-1);
        return no;
    }
}
/*
        k%=no.length;
        if(k==0) return no;
        int arr[]=new int[k];
        for(int i=0;i<k;++i)
            arr[i]=no[no.length-k+i];

        for(int i=no.length-k-1;i>=0;--i)
            no[i+k]=no[i];    

        for(int i=0;i<k;++i)
            no[i]=arr[i];
        return no;
*/