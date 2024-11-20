class Solution {
    public boolean isIsomorphic(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        
        if(s_len!=t_len)
            return false;
        
        Map<Character, Character> map_S = new HashMap<>();
        
        Map<Character, Character> map_T = new HashMap<>();
        
        for(int i=0; i<s_len; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(map_S.containsKey(ch1) && !map_S.get(ch1).equals(ch2))
                return false;
            
            if(map_T.containsKey(ch2) && !map_T.get(ch2).equals(ch1))
                return false;
            
            map_S.put(ch1, ch2);
            
            map_T.put(ch2, ch1);
        }
        
        
        return true;
    }
}