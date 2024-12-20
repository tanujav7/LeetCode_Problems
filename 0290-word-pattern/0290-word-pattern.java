class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap<>();
        
        String arr[] = s.split(" ");
        
        int n = pattern.length();
        
        if(n!=arr.length){
            return false;
        }
        
        for(int i=0; i<n; i++){
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