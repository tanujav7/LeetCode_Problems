class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            
            set.add(n);
            
            int num = getSq(n);
            
            if(num==1)
                return true;
            
            n = num;
        }
        
        return false;
    }
    
    int getSq(int n){
        int rem = 0, sq = 0;
        
        while(n!=0){
            rem = n % 10;
            sq += rem * rem;
            n = n/10;
        }
        
        return sq;
    }
}