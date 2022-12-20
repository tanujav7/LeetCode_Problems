class Solution {
    public int countOdds(int low, int high) {
        
        int N = (high-low+1)/2;
        
        if(low%2!=0 && high%2!=0)
            return N+1;
        
        return N;
    }
}