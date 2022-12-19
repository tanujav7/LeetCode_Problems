class Solution {
    public int countOdds(int low, int high) {
 
        int N = (high-low+1)/2;
        
        //If both are odd, we return N+1;
        if(low%2!=0 && high%2!=0)
            return N+1;
        
        return N;
        
    }
}