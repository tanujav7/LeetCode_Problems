class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        
        int res[] = new int[n];
        
        Arrays.sort(potions);
        
        for(int i=0; i<spells.length; i++){
            int mul = spells[i];
            int m = potions.length;
            int left = 0, right = m-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                long val = potions[mid] * (long)mul;
                
                if(val<success)
                    left = mid+1;
                
                else
                    right = mid-1;
            }
            
            res[i] = m-right-1;
        }
        
        return res;
    }
}