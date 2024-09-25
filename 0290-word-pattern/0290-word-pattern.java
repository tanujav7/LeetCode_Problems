class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap<>();
        
        
        int pattern_len = pattern.length();
        String arr[] = s.split(" ");
        
        if(arr.length!=pattern_len)
            return false;
        
        
        for(int i=0; i<pattern_len; i++){
            char ch = pattern.charAt(i);
            
            if(map.containsKey(ch) && !map.get(ch).equals(arr[i]))
                return false;
            
            if(!map.containsKey(ch) && map.containsValue(arr[i]))
                return false;
            
            map.put(ch, arr[i]);
        }
        
        return true;
    }
}