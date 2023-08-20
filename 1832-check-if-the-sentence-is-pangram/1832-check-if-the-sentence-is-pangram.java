class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean seen[] = new boolean[26];
        
        for(char ch : sentence.toCharArray()){
            seen[ch-'a'] = true;
        }
        
        for(int i=0; i<26; i++){
            if(seen[i]==false)
                return false;
        }
        
        return true;
    }
}