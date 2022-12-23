class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        
        reverse(s,left,right);
        
    }
    
   void reverse(char s[], int left, int right){
       while(left<right){ 
       char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
       }
    }
}