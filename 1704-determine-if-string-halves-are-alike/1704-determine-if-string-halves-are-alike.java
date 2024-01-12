class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()%2!=0){
           return false;
        }
        else{
            s = s.toLowerCase();
            int n = s.length();
            int k = n/2;
         //   String s1 = s.substrings(0,k);
        //    String s2 = s.substrings(k,n);
            int count1 = 0;
            int count2 = 0;
            
            for(int i=0; i<k; i++){
             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                 count1++;
            }
            
            for(int i=k; i<s.length(); i++){
             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                 count2++;
            }
            
            if(count1==count2)
                return true;
            
            else
                return false;
        }
    }
}