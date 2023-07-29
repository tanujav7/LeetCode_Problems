class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> map_S = new HashMap<>();
        Map<Character, Character> map_T = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);
            
            if(map_S.containsKey(s_ch) && !(map_S.get(s_ch).equals(t_ch)))
                return false;
            
            if(map_T.containsKey(t_ch) && !(map_T.get(t_ch).equals(s_ch)))
                return false;
            
            map_S.put(s_ch,t_ch);
            map_T.put(t_ch,s_ch);
        }
        
        return true;
    }
}