class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     
     String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
      Set<String> set = new HashSet<>();
        
      for(int i=0; i<words.length; i++){
          String code = words[i];
          char arr[] = code.toCharArray();
          StringBuilder str = new StringBuilder();
          for(char ch:arr)
              str.append(MORSE[ch-'a']);
          set.add(str.toString());
      }
        
      return set.size();
        
    }
}