class Solution {
    public double myPow(double x, int n) {
        
        int exp = n;
        double res = 1;
        n = Math.abs(n);
        
        while(n>=1){
            if(n%2==1)
                res = res*x;
            x = x*x;
            n = n/2;
        }
      
        if(n==Integer.MIN_VALUE)
            return (x==1 || x==-1) ? 1 : 0;
        
        
        return (exp<0) ? (1/res) : res;
    }
}