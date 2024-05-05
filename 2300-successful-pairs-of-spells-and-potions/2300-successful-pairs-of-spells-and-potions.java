class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int sLen = spells.length;
        
        int pLen = potions.length;
        
        int res[] = new int[sLen];
        
        Arrays.sort(potions);
        
        for(int i=0; i<sLen; i++){
            int getCount = getCount(potions, spells[i], pLen, success);
            res[i] = getCount;
        }
        
        return res;
    }
    
    int getCount(int potions[], int num, int n, long success){
        int low = 0;
        int high = n-1;
        int mid = 0;
        
        while(low<=high){
             mid = low + (high-low)/2;
            
            long mul = (long)num * potions[mid];
            
            if(mul<success)
                low = mid+1;
            
            else
                high = mid-1;
        }
        
        return n-low;
    }
}