class Solution {
    public boolean isPerfectSquare(int num) {
        
        int low = 1, high = num;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            long sq = (long)mid * (long)mid;
            
            if(sq>num)
                high = mid-1;
            
            else if(sq<num)
                low = mid+1;
            
            else
                return true;
        }
        
        return false;
    }
}