class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = Integer.MIN_VALUE;
        
        int n = piles.length;
        
        
        for(int i=0; i<n; i++){
            if(piles[i]>=max)
                max = piles[i];
        }
          
        int low = 1, high = max;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            int k = getSpeed(piles, n, mid);
            
            if(k<=h)
                high = mid-1;
            
            else
                low = mid+1;
        }
        
        return low;
    }
    
    int getSpeed(int piles[], int n, int num){
        int totalHr = 0;
        
        for(int i=0; i<n; i++){
              totalHr += Math.ceil((double)(piles[i])/(double)(num));
        }
        
        return (int)totalHr;
    }
}