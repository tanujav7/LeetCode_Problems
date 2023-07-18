class Solution {
    public boolean checkIfPangram(String sentence) {
        
      /*  Set<Character> set = new HashSet<>();
        
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)!=' ')
                set.add(sentence.charAt(i));
        }
        
        return (set.size()==26);*/
        
        for(int i=0; i<26; i++){
            char currentChar = (char)(i+'a');
            if(sentence.indexOf(currentChar)==-1)
                return false;
        }
        
        return true;
        
    }
}