class Solution {
    public double myPow(double x, int n) {
        
        double res = 1;
        int k = Math.abs(n);
        
        while(k>=1){
            
            if(k % 2 == 1)
                res = res*x;
            
            x = x*x;
            k = k/2;
            
        }
        if (n == Integer.MIN_VALUE) 
        return (x == 1 || x == -1) ? 1 : 0;
        
        return (n<0) ? (1/res) : res;
        
    }
}