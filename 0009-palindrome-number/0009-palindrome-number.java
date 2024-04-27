class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        
        int rev = 0;
        
        while(x>0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        
        if(rev==temp)
            return true;
        
        return false;
    }
}