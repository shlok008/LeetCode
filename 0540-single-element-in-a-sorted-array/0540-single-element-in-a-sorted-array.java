class Solution {
    public int singleNonDuplicate(int[] num) {
        if(num.length==1 || num[0]!=num[1]) return num[0];
        int start=0;
        int end=num.length-1;
        //int ans=num[num.length-1];
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid==0 || mid==(num.length-1) || (num[mid-1]!=num[mid] && num[mid+1]!=num[mid])) 
                return num[mid];
            if(num[mid]!=num[mid-1] && num[mid]==num[mid+1] && mid%2==1) end=mid-1;
            else if(num[mid]==num[mid-1] && num[mid]!=num[mid+1] && mid%2==0) end=mid-2;
            else if(num[mid]==num[mid-1] && num[mid]!=num[mid+1] && mid%2==1) start=mid+1;
            else start=mid+2;//if(num[mid]==num[mid-1] && num[mid]!=num[mid+1] && mid%2==1) start=mid+1;
        }
        return num[start];
    }
}