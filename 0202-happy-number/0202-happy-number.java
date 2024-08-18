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
    
    
    int getSq(int num){
        
        int temp = num;
         
        int sq = 0;
        
        while(num!=0){
            int rem = num % 10;
            sq += rem * rem;
            num = num/10;
        }
        
        return sq;
    }
}