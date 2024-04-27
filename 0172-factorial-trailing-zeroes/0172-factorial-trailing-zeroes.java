class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        
        for(int i=5; n/i>=1; i = i*5){
            count += n/i;
        }
        
        return count;
    }
}