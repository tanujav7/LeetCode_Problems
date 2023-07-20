class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int j = n-1;
        
        for(int i=0; i<n; i++){
            if(Character.isLetter(s.charAt(i))){
                while(!Character.isLetter(s.charAt(j)))
                    j--;
                str.append(s.charAt(j--));
            }
            
            else{
                str.append(s.charAt(i));
            }
        }
        
        return str.toString();
    }
}