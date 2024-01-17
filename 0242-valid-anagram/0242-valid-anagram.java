class Solution {
    public boolean isAnagram(String s, String t) {
        
        int countArr[] = new int[26];
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0; i<s.length(); i++){
            countArr[s.charAt(i)-'a']++;
        }
        
        
        for(int i=0; i<t.length(); i++){
            if(countArr[t.charAt(i)-'a']==0)
                return false;
            else
                countArr[t.charAt(i)-'a']--;
        }
        
        return true;
    }
}