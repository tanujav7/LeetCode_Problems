class Solution {
    public int maxVowels(String s, int k) {
        
        Set<Character> set = new HashSet<>();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
       
        int count = 0;
        
        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(set.contains(ch))
                count++;
        }
        
         int maxCount = count;
        
         for(int i=k; i<s.length(); i++){
           count += set.contains(s.charAt(i)) ? 1 : 0;
           count -= set.contains(s.charAt(i-k)) ? 1 : 0;
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}