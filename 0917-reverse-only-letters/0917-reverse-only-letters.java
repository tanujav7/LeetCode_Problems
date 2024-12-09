class Solution {
    public String reverseOnlyLetters(String s) {
        
      
        int i = 0, j = s.length()-1;
        
        char arr[] = s.toCharArray();
        
        while(i<j){
            while(i<j && !Character.isLetter(arr[i])){
                i++;
            }
            
            while(i<j && !Character.isLetter(arr[j])){
                j--;
            }
            
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        
        String res = new String(arr);
        
        return res;
    }
}