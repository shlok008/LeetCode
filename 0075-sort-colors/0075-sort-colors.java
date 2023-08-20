class Solution {
    public int[] sortColors(int[] num) {
        int low=0;
        int mid=0;
        int high=num.length-1;
        while(mid<=high)
        {
            if(num[mid]==0) {num[mid++]=num[low];num[low++]=0;}
            else if(num[mid]==1)mid++;
            else {num[mid]=num[high];num[high--]=2;}
        }
        //System.gc();
        return num;
    }
}