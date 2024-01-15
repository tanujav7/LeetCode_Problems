class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap<>();
        
        String arr[] = s.split(" ");
        
        int n = pattern.length();
        
        if(n!=arr.length)
            return false;
        
        for(int i=0; i<n; i++){
            char ch = pattern.charAt(i);
            String str = arr[i];
            
            if(map.containsKey(ch) && !(map.get(ch).equals(str))){
                return false;
            }
            
            if(!map.containsKey(ch) && map.containsValue(str)){
                return false;
            }
            
            else{
                map.put(ch, str);
            }
        }
        
        return true;
        
    }
}