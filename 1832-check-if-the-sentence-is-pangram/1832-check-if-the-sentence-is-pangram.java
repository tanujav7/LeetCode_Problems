class Solution {
    public boolean checkIfPangram(String sentence) {
        
        for(int i=0; i<26; i++){
            char ch = (char)(i+'a');
            
            if(sentence.indexOf(ch)==-1)
                return false;
        }
        
        return true;
    }
}