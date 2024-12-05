class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        
        int n = strs.length;
        
        for(int i=1; i<n; i++){
            String str = strs[i];
            int j = 0;
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