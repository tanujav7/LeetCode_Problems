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
            count += (set.contains(s.charAt(i))) ? 1 : 0;
        }
        
        int max_vowels = count;
        
        for(int i=k; i<s.length(); i++){
            count += (set.contains(s.charAt(i))) ? 1 : 0;
            count -= (set.contains(s.charAt(i-k))) ? 1 : 0;
            max_vowels = Math.max(max_vowels, count);
        }
        
        
        return max_vowels;
    }
}