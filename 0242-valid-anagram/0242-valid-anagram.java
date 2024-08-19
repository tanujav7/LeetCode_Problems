class Solution {
    public boolean isAnagram(String s, String t) {
        
        int s_len = s.length();
        
        int t_len = t.length();
        
        int freq[] = new int[26];
        
        for(int i=0; i<s_len; i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<t_len; i++){
            freq[t.charAt(i)-'a']--;
        }
        
        
        for(int i=0; i<26; i++){
            if(freq[i]!=0)
                return false;
        }
        
        return true;
    }
}