class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
            return false;
        
        int tempNum = x;
        
        int reversedNum = 0;
        
        while(tempNum!=0){
            int rem = tempNum % 10;
            reversedNum = reversedNum * 10 + rem;
            tempNum = tempNum / 10;
        }
        
        return ( reversedNum == x );
    }
}