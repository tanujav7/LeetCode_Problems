class Solution {
    public boolean isAnagram(String s, String t) {
        
        int freArr[] = new int[26];
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0; i<s.length(); i++){
            freArr[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<s.length(); i++){
            freArr[t.charAt(i)-'a']--;
        }
        
        for(int i=0; i<26; i++){
            if(freArr[i]!=0)
                return false;
        }
        
        
        return true;
    }
}