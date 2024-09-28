class Solution {
    public boolean isAnagram(String s, String t) {
        int freqArr[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            freqArr[s.charAt(i)-'a']++; 
        }
        
        for(int i=0; i<t.length(); i++){
            freqArr[t.charAt(i)-'a']--; 
        }
        
        
        for(int num : freqArr){
            if(num!=0)
                return false;
        }
        
        return true;
    }
}