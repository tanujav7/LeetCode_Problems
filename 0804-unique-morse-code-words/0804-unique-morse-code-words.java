class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     
     String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
        
        Set<String> set = new HashSet<>();
        
        for(String word:words){
            String s = word;
            StringBuilder str = new StringBuilder();
            for(char ch:s.toCharArray())
                str.append(MORSE[ch-'a']);
            set.add(str.toString());
        }
        
        return set.size();
    }
}