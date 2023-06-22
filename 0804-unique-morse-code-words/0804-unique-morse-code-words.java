class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     
     String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        
        for(String word:words){
            StringBuilder code = new StringBuilder();
            for(char ch:word.toCharArray())
                code.append(MORSE[ch-'a']);
            set.add(code.toString());
        }
        
        return set.size();
        
    }
}