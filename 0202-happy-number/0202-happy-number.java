class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            
            n = getSquare(n);
            
            if(n==1)
                return true;
        }
        
        return false;
    }
    
    int getSquare(int num){
        int res = 0;
        
        while(num!=0){
            int rem = num % 10;
            res = rem * rem + res;
            num = num/10;
        }
        
        return res;
    }
}