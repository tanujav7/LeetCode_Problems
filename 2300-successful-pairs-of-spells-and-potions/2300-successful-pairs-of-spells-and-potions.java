class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int m = potions.length;
        
        int res[] = new int[n];
        
        Arrays.sort(potions);
        
        
        for(int i=0; i<n; i++){
           int low = 0;
           int high = m-1;
            int mid = 0;
            while(low<=high){
                mid = low + (high-low)/2;
                
                long mul = (long)potions[mid] * spells[i];
                
                if(mul>=success)
                    high = mid-1;
                
                else
                    low = mid+1;
            }
            
            res[i] = m-low;
        }
        
        return res;
    }
}