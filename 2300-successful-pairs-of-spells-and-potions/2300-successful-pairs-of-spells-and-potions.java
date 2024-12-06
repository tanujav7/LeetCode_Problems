class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        
        Arrays.sort(potions);
        
        int res[] = new int[n];
        
       
        
        for(int i=0; i<spells.length; i++){
            int mul = spells[i];
            int left = 0, right = potions.length-1;
            
            while(left<=right){
                int mid = left + (right-left)/2;
                long val = (long)potions[mid] * mul;
                if(val>=success){
                    right = mid-1;
                }
                
                else{
                    left = mid+1;
                }
            }
            
            res[i] = potions.length-1-right;
        }
        
        return res;
    }
}