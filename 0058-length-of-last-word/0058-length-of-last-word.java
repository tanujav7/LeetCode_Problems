class Solution {
    public int lengthOfLastWord(String s) {
        
        int count = 0;
        
        s = s.trim();
        
        for(int i=s.length()-1; i>=0; --i){
            char ch = s.charAt(i);
            
            if(ch==' ')
                break;
            
            else
                count++;
        }
        
        return count;
    }
}