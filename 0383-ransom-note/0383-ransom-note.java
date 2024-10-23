class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch : magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            int count = map.containsKey(ch) ? map.get(ch)-1 : -1;
            
            if(count==-1)
                return false;
            
            map.put(ch, count);
        }
        
        return true;
    }
}