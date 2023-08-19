class Solution {
    public int[] rotate(int[] no, int k) {
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
    }
}