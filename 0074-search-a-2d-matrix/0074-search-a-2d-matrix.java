class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int start=0;
        int end=mat.length*mat[0].length;end--;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int m=mid/mat[0].length;
            int n=mid-m*mat[0].length;
            if(tar==mat[m][n]) return true;
            else if(tar>mat[m][n])start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}
        /*int m=0;
        while(m<mat.length)
        {
            if(tar==mat[m][mat[0].length-1])
            return true;
            else if(tar>mat[m][mat[0].length-1])
            m++;
            else break;
        }
        if(m==mat.length) return false;
        int start=0;int end=mat[0].length;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(tar==mat[m][mid])
            return true;
            else if(tar>mat[m][mid])start=mid+1;
            else end=mid-1;
        }
        return false;*/