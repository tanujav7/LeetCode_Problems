class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        
        int n = s.length();
        
        int resLen = 0;
        
        for(int i=n-1; i>=0; --i){
            if(s.charAt(i)==(' '))
                break;
            else
                resLen++;
        }
        
        return resLen;
    }
}