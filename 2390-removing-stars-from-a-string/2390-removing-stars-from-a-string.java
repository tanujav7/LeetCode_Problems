class Solution {
    public String removeStars(String s) {
        //Two pointers
        int n = s.length();
        char arr[] = new char[n];
        int j = 0;
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='*')
                j--;
            else
                arr[j++] = ch;
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<j; i++)
            str.append(arr[i]);
        
        return str.toString();
    }
}