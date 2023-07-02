class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i=0, j=0;
        
        StringBuilder str = new StringBuilder();
        
        int n1 = word1.length();
        int n2 = word2.length();
        
        while(i<n1 || j<n2){
            if(i<n1){
                str.append(word1.charAt(i));
                i++;
            }
            if(j<n2){
                str.append(word2.charAt(j));
                j++;
            }
        }
        
        return str.toString();
    }
}