class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder res = new StringBuilder();
        
        int s1 = 0;
        int s2 = 0;
        
        int length1 = word1.length();
        int length2 = word2.length();
        
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        
        
        while(s1<length1 && s2<length2){
           res.append(arr1[s1++]);
           res.append(arr2[s2++]);
        }
        
        while(s1<length1)
          res.append(arr1[s1++]);
        
        while(s2<length2)
           res.append(arr2[s2++]);
        
        return res.toString();
    }
}