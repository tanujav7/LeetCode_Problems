class Solution {
    public int minBitFlips(int start, int goal) {
        
        int n = start^goal;
        int count = 0;
        
        while(n>0){
            count++;
            n = n&(n-1);
        }
        
        return count;
    }
}