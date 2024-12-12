class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int res[] = new int[n];
        
        Arrays.sort(potions);
        
        for(int i=0; i<spells.length; i++){
            int left = 0;
            int right = potions.length-1;
            int mul = spells[i];
            while(left<=right){
                int mid = left + (right-left)/2;
                long val = (long)potions[mid] * mul;
                
                if(val<success)
                   left = mid+1;
                else
                   right = mid-1;
            }
            
            res[i] = potions.length-right-1;
        }
        
        return res;
        
    }
}