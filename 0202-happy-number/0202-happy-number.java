class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> seen = new HashSet<>();
        
        while(!seen.contains(n)){
             
            seen.add(n);
            
            n = sumSquareofDigits(n);
            
            if(n==1)
                return true;
        }
        
        return false;
    }
    
    int sumSquareofDigits(int num){
        int rem = 0;
        int sq = 0;
        while(num!=0){
            rem = num%10;
            sq = sq+(int)Math.pow(rem,2);
            num = num/10;
        }
        return sq;
    }
}