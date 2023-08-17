class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int m=0,n=0;
        while(m<mat.length)
        {
            if(tar==mat[m][mat[0].length-1])
            return true;
            else if(tar>mat[m][mat[0].length-1])
            m++;
            else break;
        }
        if(m==mat.length) return false;
        while(n<mat[0].length)
        {
            if(tar==mat[m][n])
            return true;
            else if(tar>mat[m][n])
            n++;
            else break;
        }
        return false;
    }
}