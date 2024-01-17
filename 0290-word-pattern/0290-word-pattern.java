class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String arr[] = s.split(" ");
        
        if(pattern.length()!=arr.length)
            return false;
        
        Map<Character, String> map = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            
            if(map.containsKey(ch) && !(map.get(ch).equals(arr[i])))
                return false;
            
            if(!map.containsKey(ch) && map.containsValue(arr[i]))
                return false;
            
            else
                map.put(ch, arr[i]);
        }
        
        return true;
        
    }
}