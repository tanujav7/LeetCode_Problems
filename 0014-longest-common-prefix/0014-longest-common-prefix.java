class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        
        String prefix = strs[0];
        
        for(int i=1; i<n; i++){
            int j = 0;
            String str = strs[i];
            
            while(j<str.length() && j<prefix.length() && str.charAt(j)==prefix.charAt(j)){
                j++;
            }
            
            prefix = prefix.substring(0, j);
            
            if(prefix.equals(""))
                return "";
        }
        
        return prefix;
    }
}