class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        
        int MAX = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(piles[i]>=MAX)
                MAX = piles[i];
        }
            
        
       
        //Binary Search
        
        int low = 1, high = MAX;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            int k = getSpeed(piles, n, mid);
            
            if(k<=h){
                high = mid-1;
            }
            
            else
                low = mid+1;
        }
        
        return low;
    }
    
    int getSpeed(int piles[], int n, int num){
        int totalHr = 0;
        
        for(int i=0; i<n; i++){
            totalHr += Math.ceil((double)(piles[i]) / (double)(num));
        }
        
        return totalHr;
    }
}