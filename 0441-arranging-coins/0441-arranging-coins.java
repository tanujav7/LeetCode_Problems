class Solution {
    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        
        while(left<=right){

            long mid = left+(right-left)/2;
            long K = (mid)*(mid+1)/2;
            
            if(K>n)
                right = mid-1;
            
            else if(K<n)
                left = mid+1;
            
            else
                return (int)mid;
        }
        
        return (int)right;
        
    }
}