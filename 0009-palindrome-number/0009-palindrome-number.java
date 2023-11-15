class Solution {
    public boolean isPalindrome(int x) {
        
        int tempNum = x;
        int num = 0;
        
        while(tempNum>0){
            int rem = tempNum%10;
            num = num*10 +(rem);
            tempNum = tempNum/10;
        }
        
        if(num==x)
            return true;
        
        else
            return false;
    }
}