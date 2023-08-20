class Solution {
    public String finalString(String s) {
        
    //    char arr[] = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        String res = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='i')
               sb = sb.reverse();
            else
                sb.append(ch);
        }
        
        return sb.toString();
    }
}