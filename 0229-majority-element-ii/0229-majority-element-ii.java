class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int a=-1,b=-2;
        int m=0,n=0;
        for(int i=0;i<arr.length;++i)
        {
            if(arr[i]==a) m++;
            else if(arr[i]==b) n++;
            else if(m==0)
            { a=arr[i];m=1;}
            else if(n==0)
            {b=arr[i];n=1;}
            
            else {m--;n--;}
        }
        List<Integer> ans=new ArrayList<>();
        m=0;n=0;
        for(int i=0;i<arr.length;++i)
        {
            if(arr[i]==a) m++;
            if(arr[i]==b) n++;
            if(m>arr.length/3 && n>arr.length/3)break;
        }
        if(m>arr.length/3)ans.add(a);
        if(n>arr.length/3)ans.add(b);
        return ans;
    }

}