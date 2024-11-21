class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> map_S = new HashMap<>();
        Map<Character, Character> map_T = new HashMap<>();
        int s_len = s.length();
        
        int t_len = t.length();
        
        if(s_len!=t_len)
            return false;
        
        for(int i=0; i<s_len; i++){
            char ch_S = s.charAt(i);
            char ch_T = t.charAt(i);
            
            if(map_S.containsKey(ch_S) && !map_S.get(ch_S).equals(ch_T))
                return false;
            
            if(map_T.containsKey(ch_T) && !map_T.get(ch_T).equals(ch_S))
                return false;
            
            map_S.put(ch_S, ch_T);
            map_T.put(ch_T, ch_S);
        }
        
        return true;
    }
}