class Solution {
    public void reverseString(char[] s) {
        
        reverse(s,0,s.length-1);
    }
    
    void reverse(char s[], int i, int j){
        while(i<j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
    }
  }
}