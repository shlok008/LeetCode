class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int col=mat[0].length-1;
        int row=0;
        while(col>=0 && row<mat.length)
        {
            if(mat[row][col]==tar)return true;
            else if(mat[row][col]>tar) col--;
            else row++;
        }
        return false;
    }
}