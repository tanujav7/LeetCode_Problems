class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while(left<=right){
            long mid = left+(right-left)/2;
            
           long total = (mid)*(mid+1)/2;
            
            if(total==n)
                return (int)mid;
            
            else if(total<n)
                left = mid+1;
            
            else
                right = mid-1;
                
        }
        
        return (int)right;
    }
}