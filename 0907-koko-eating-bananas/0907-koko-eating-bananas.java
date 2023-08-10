/*class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int end=p[0];
        for(int i=1;i<p.length;++i) if(end<p[i])end=p[i];
        int start=0;
        int a=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int ans=0;
            for(int i=0;i<p.length;++i) ans+=Math.ceil(p[i]*1.0/mid);
            if(ans==h) {a=mid;end=mid-1;}
            else start=mid+1; 
        }
        return a;
    }
}*/
class Solution {
    public int maxEl(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }

    public long totalHours(int[] piles, int hrs) {
        long total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += (piles[i] + hrs - 1) / hrs; // Ceiling division
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxEl(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = totalHours(piles, mid);
            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}