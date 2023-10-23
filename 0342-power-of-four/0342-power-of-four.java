class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n==1)
            return true;
        
        int rem = 0;
        
        if(n<=0 || n<4)
            return false;
        
        while(n>=4){
            rem = n%4;
            if(rem!=0)
                return false;
            n = n/4;
        }
        
        return (rem==0 && n==1);
    }
}