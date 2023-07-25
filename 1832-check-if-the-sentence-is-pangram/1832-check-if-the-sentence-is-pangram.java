class Solution {
    public boolean checkIfPangram(String sentence) {
        
        for(int i=0; i<26; i++){
            char currentChar = (char)(i+'a');
            if(sentence.indexOf(currentChar)==-1)
                return false;
        }
        
        return true;
    }
}