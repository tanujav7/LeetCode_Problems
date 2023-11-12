class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
      
        while(!set.contains(n)){
            set.add(n);
            
             n = getSquareNum(n);
            
            if(n==1)
                return true;
        }
        
        return false;
    }
    
    int getSquareNum(int n){
        int sumSquare = 0;
        
        while(n!=0){
            int rem = n%10;
            sumSquare += Math.pow(rem, 2);
            n = n/10;
        }
        
        return sumSquare;
    }
}