class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String str[] = s.split(" ");
        
        if(str.length!=pattern.length())
            return false;
        
        HashMap <Character, String> bijection = new HashMap<>();
        
        for(int i=0; i<str.length; i++){
                char ch = pattern.charAt(i);
            
            if(bijection.containsKey(ch) && !bijection.get(ch).equals(str[i]))
                return false;
            
            else if(!bijection.containsKey(ch) && bijection.containsValue(str[i]))
                return false;
            
            bijection.put(ch, str[i]);
        }
        
        return true;
    }
}