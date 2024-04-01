class Solution {
    List<String> resList;
    
    public List<String> letterCasePermutation(String s) {
        resList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        backTrack(s, sb, 0);
        return resList;
    }
    
    void backTrack(String s, StringBuilder sb, int index){
        if(index==s.length()){
            resList.add(sb.toString());
            return;
        }
        
        if(Character.isAlphabetic(s.charAt(index))){
            if(Character.isUpperCase(s.charAt(index)))
                sb.setCharAt(index, Character.toLowerCase(s.charAt(index)));
            else
                sb.setCharAt(index, Character.toUpperCase(s.charAt(index)));
            
            backTrack(s,sb,index+1);
            sb.setCharAt(index, s.charAt(index));
        }
         backTrack(s,sb,index+1);
    }
}