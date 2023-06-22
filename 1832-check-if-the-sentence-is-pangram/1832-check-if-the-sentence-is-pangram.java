class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean freq[] = new boolean[26];
        
        for(int i=0; i<sentence.length(); i++)
            freq[sentence.charAt(i)-'a'] = true;
        
        for(int i=0; i<26; i++){
            if(freq[i]==false)
                return false;
        }
        
        return true;
    }
}