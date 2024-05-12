class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int sLen = spells.length;
        int pLen = potions.length;
        
        int res[] = new int[sLen];
        
        Arrays.sort(potions);
        
        for(int i=0; i<sLen; i++){
            res[i] = getCount(spells[i], potions, success);
        }
        
        return res;
    }
    
    int getCount(int num, int potions[], long success){
        
        int n = potions.length;
        int low = 0;
        int high = n-1;
        
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            long mul = (long)num * potions[mid];
            
            if(mul<success)
                low = mid+1;
            
            else
                high = mid-1;
        }
        
        return n-low;
    }
}