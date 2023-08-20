class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        
        char arr[] = s.toCharArray();
        
        int n = arr.length;
        int i = 0;
        int j = arr.length-1;
        
        while(i<j){
            while(i<j && !Character.isLetter(arr[i]) && !Character.isDigit(arr[i]))
                i++;
             while(i<j && !Character.isLetter(arr[j]) && !Character.isDigit(arr[j]))
                j--;
            if(arr[i]!=(arr[j]))
                return false;
            else{
                i++;
                j--;
            }
        }
        
        return true;
    }
}