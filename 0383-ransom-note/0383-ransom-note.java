class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch : magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        
        for(char ch : ransomNote.toCharArray()){
            int val = (map.containsKey(ch)) ? map.get(ch)-1 : -1;
            
            if(val==-1)
                return false;
            
            else
                map.put(ch, val);
        }
        
        return true;
    }
}