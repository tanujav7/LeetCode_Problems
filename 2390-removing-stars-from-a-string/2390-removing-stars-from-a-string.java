class Solution {
    public String removeStars(String s) {
        
        StringBuilder res = new StringBuilder();
        char arr[] = new char[s.length()];
        
        int j=0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='*')
                j--;
            else
                arr[j++] = ch;
        }
        
        for(int i=0; i<j; i++)
            res.append(arr[i]);
        
        return res.toString();
    }
}