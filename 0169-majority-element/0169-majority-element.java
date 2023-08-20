class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<=nums.length/2;++i)
        {
            int m=i;
            for(int j=i+1;j<nums.length;++j)
            {
                if(nums[j]<nums[m]) m=j;
            }
            if(i!=m){nums[i]+=nums[m];nums[m]=nums[i]-nums[m];nums[i]-=nums[m];}
        }
        return nums[nums.length/2];
    }
}