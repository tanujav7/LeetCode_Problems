class Solution {
    public int numberOfMatches(int n) {
        
        int matches = 0;
        int teams = 0;
        int sum = 0;
        
        while(n>1){
            int num = n/2;
            if(n%2!=0)
                teams = num + 1;
            else 
                teams = num;
            matches = num;
            sum += matches;
            n = teams;
        }
        
        return sum;
    }
}