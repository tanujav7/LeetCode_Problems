class Solution {
    public boolean checkIfPangram(String sentence) {
//         Set<Character> seen = new HashSet<>();
        
//         for(char ch:sentence.toCharArray()){
//             seen.add(ch);
//         }
        
//         return seen.size()==26;
        
        
        int freq[] = new int[26];
        
        for(char ch:sentence.toCharArray()){
            freq[ch-'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(freq[i]==0)
                return false;
        }
        
        return true;
    }
}