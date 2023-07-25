class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder str = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        
        for(int i=0; i<Math.max(n1,n2); i++){
            if(i<n1)
                str.append(word1.charAt(i));
            
            if(i<n2)
                str.append(word2.charAt(i));
        }
        
        return str.toString();
    }
}