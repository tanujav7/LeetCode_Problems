class Solution {
    public String reverseOnlyLetters(String s) {
        
        int pointer = 0;
        
        int i = 0, j = s.length()-1;
        
        char arr[] = s.toCharArray();
        
        while(i<j){
            
            if (Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
                // Swap the letters
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            while(i<s.length() && j>=0 && Character.isLetter(arr[i])==false){
                i++;
            }
                
            while(i<s.length() && j>=0 && Character.isLetter(arr[j])==false){
                j--;
            }
            
        }
        
        
        String res = new String(arr);
        
        return res;
    }
}