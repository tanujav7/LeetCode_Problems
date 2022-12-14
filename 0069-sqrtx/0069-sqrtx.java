class Solution {

    public int mySqrt(int x) {
       
        if(x==1)
            return 1;
        
        
       int left = 1;
        int right = x/2;
        
        while(left<=right){
            
           int mid = left+(right-left)/2;
            
            long sq = (long)mid*(long)mid;
            
            if(sq==x)
                return mid;
            
             else if(sq<x)
                left = mid+1;
            
            else
                right = mid-1;
   
        }
        
        return right;
        
    }
}
