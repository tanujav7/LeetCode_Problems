class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        
        for(int i=n; i>=1; i = i/5){
            count += (i/5);
        }
        
        return count;
    }
}