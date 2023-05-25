class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> seen = new HashSet<>();
        
        while(!seen.contains(n)){
            seen.add(n);
            n = sumOfSquare(n);
            if(n==1)
              return true;
        }
        return false;
    }

    int sumOfSquare(int num){
        int sq = 0;
        int rem = 0;

        while(num!=0){
            rem = num%10;
            sq = sq + (int) Math.pow(rem,2);
            num = num/10;
        }

        return sq;
    }
}