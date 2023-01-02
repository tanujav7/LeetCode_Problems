class Solution {
    public boolean detectCapitalUse(String word) {
        
        int count = 0;
        
        for(int i=0; i<word.length(); i++){
             if(word.charAt(i)>=65 && word.charAt(i)<91){
                 count++;
             }
        }
        
        if(count==word.length())
            return true;
        
        else if(count==0)
            return true;
        
        else if(count==1 && (word.charAt(0)>=65 && word.charAt(0)<91 ))
                return true;
                
        return false;
    }
}