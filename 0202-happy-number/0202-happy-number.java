class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            
            int num = getSquareOfDigits(n);
            
            if(num==1)
                return true;
            
            n = num;
        }
        
        return false;
    }
    
    int getSquareOfDigits(int num){
        int sum = 0;
        
        while(num>0){
            int rem = num % 10;
            sum = rem * rem + sum;
            num = num/10;
        }
        
        return sum;
    }
}