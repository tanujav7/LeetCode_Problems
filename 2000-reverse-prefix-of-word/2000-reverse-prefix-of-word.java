class Solution {
    public String reversePrefix(String word, char ch) {
        
        String str = "";
        
        StringBuilder sb = new StringBuilder();
        
        int flag = 0;
        
        int n = word.length();
        
        int i = 0;
        
        while(i<n && word.charAt(i)!=ch){
                i++;
        }
       
        if(i==n)
            return word;
        
        str = sb.append(word.substring(0, i+1)).reverse().toString();
        
        sb = new StringBuilder();
        
        return sb.append(str).append(word.substring(i+1, n)).toString();
    }
}