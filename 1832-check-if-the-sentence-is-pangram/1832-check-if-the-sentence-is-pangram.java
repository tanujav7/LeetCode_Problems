class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean freq[] = new boolean[26];
        
        for(char ch : sentence.toCharArray()){
            freq[ch-'a'] = true;
        }
        
        for(boolean val : freq){
            if(val==false)
                return false;
        }
        
        return true;
    }
}