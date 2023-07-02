class Solution {
    public String reverseOnlyLetters(String s) {
        
       
        

        int i=0, j=s.length()-1;
        
        char arr[] = s.toCharArray();
        
        while(i<j){
            if(Character.isLetter(arr[i]) && (Character.isLetter(arr[j]))){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            else if(!Character.isLetter(arr[i]))
                i++;
            
            else
                j--;
  
        }
        
         String str = new String(arr);
        
        return str.toString();
    }
}