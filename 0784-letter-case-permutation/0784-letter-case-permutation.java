class Solution {
    List<String> list;
    public List<String> letterCasePermutation(String s) {
        list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        letterCasePermutation(s, sb, 0);
        return list;
    }
    
    void letterCasePermutation(String s, StringBuilder sb, int i){
        if(i==s.length()){
            list.add(sb.toString());
            return;
        }
        
        if(Character.isAlphabetic(s.charAt(i))){
            if(Character.isUpperCase(s.charAt(i)))
               sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            else
               sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            
            letterCasePermutation(s, sb, i+1);
            sb.setCharAt(i, s.charAt(i));
        }
        
        letterCasePermutation(s, sb, i+1);
    }
}