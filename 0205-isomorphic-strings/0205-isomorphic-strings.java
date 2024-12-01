class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> map_S = new HashMap<>();
        Map<Character, Character> map_T = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(i);
            if(map_S.containsKey(ch_s) && !map_S.get(ch_s).equals(ch_t))
                return false;
            if(map_T.containsKey(ch_t) && !map_T.get(ch_t).equals(ch_s))
                return false;
            map_S.put(ch_s, ch_t);
            map_T.put(ch_t, ch_s);

        }
        
        return true;
    }
}