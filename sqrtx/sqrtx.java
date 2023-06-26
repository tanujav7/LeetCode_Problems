class Solution {
    public int mySqrt(int x) {
        int low = 1, high = x;
        
        while(low<=high){
            int mid = (low)+(high-low)/2;
            
            long sq = (long)mid*(long)mid;
            
            if(sq<x)
                low = mid+1;
            else if(sq>x)
                high = mid-1;
            else
                return mid;
        }
        
        return high;
    }
}