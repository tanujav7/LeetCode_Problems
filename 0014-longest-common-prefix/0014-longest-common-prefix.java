class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        
        for(int i=1; i<strs.length; i++){
            String str = strs[i];
            
            while(str.indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.equals(""))
                    return "";
            }
        }
        
        return prefix;
    }
}