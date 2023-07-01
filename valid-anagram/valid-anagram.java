class Solution {
    public boolean isAnagram(String s, String t) {
        
        s = s.toLowerCase();
        t = t.toLowerCase();
        
        if(s.length()!=t.length())
            return false;
        
        else{
            char str1[] = s.toCharArray();
            char str2[] = t.toCharArray();
            
            Arrays.sort(str1);
            Arrays.sort(str2);
            
            if(Arrays.equals(str1,str2)==true)
                return true;
            
            else
                return false;
        }
        
      //  return false;
    }
}