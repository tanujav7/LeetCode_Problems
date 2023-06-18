class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            
            n = sumOfSquare(n);
            
            if(n==1)
                return true;
        }
        
        return false;
    }
    
    int sumOfSquare(int num){
        
        int res = 0;
        while(num!=0){
            int rem = num%10;
            res+=Math.pow(rem,2);
            num = num/10;
        }
        
        return res;
    }
}