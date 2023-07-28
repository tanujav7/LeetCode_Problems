class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder str = new StringBuilder();
        int j = s.length()-1;
        
        for(int i=0; i<s.length(); i++){
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