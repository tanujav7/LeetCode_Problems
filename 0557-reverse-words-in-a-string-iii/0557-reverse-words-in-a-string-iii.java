class Solution {
    public String reverseWords(String s) {
        
        //Two pointer initialization
        int i = 0;
        int j = 0;
        
        int n = s.length();
        
        char arr[] = s.toCharArray();
        
        while(i<n && j<n){
            
            while(i<n && arr[i]==' ')
                i++;
            
            j = i;
            
            while(j<n && arr[j]!=' ')
                j++;
            
            reverseString(arr, i, j-1);
            
            i = j;
        }
        
        
        return new String(arr);
    }

      void reverseString(char[] s, int i, int j) {
        
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    }
            
}