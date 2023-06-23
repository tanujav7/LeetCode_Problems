class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> map_S = new HashMap<>();
        Map<Character, Character> map_T = new HashMap<>();
        
        //Two pointers
        int i=0, j=0;
        
        while(i<s.length() && j<t.length()){
            if((map_S.containsKey(s.charAt(i)) && (map_S.get(s.charAt(i))!=t.charAt(j))) ||   ((map_T.containsKey(t.charAt(j))) && ((map_T.get(t.charAt(j))!=s.charAt(i)))))
                return false;
            
            else{
                map_S.put(s.charAt(i),t.charAt(j));
                map_T.put(t.charAt(j),s.charAt(i));
            }
            
            i++;
            j++;
        }
        
        return true;
    }
}