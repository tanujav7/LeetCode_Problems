class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        
        int left = 0;
        
        int n = s.length();
        
        int longestSubstring = 0;
        
        for(int right=0; right<n; right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }

                set.add(s.charAt(right));
            
            longestSubstring = Math.max(longestSubstring, right-left+1);
        }
        
        return longestSubstring;
    }
}