class Solution {
    public int maxProfit(int[] p) {
        int pro=0;
        int min=p[0];
        for(int i=1;i<p.length;++i)
        {
            if(p[i]-min>pro) pro=p[i]-min;
            else if(p[i]-min<0)min=p[i];
        }
        return pro;
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int b=p[0];
        int s=-9999;
        int t=0;
        
        for(int i=1;i<p.length;++i){
            if(p[i]<b){
                b=p[i];
                s=-1;
            }
            else if(p[i]>b && p[i]<s);
            else
            {
                s=p[i];
                if(t==0)
                    t=s-b;
                else if(t<s-b)
                    t=s-b;
                else;
            }
        }
        
        return t;*/

