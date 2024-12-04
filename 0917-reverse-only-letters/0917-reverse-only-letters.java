class Solution {
    public String reverseOnlyLetters(String s) {
        
        char arr[] = s.toCharArray();
        int i = 0, j = arr.length-1;
        
        while(i<j){
            if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            while(i<arr.length && j>=0 && !Character.isLetter(arr[i])){
                i++;
            }
            
            while(i<arr.length && j>=0 && !Character.isLetter(arr[j])){
                j--;
            }
        }
        
        
        String res = new String(arr);
        
        return res;
    }
}