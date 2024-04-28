class Solution {
    List<String> resList;
    public List<String> letterCombinations(String digits) {
        
       
        resList = new ArrayList<>();
        
         if(digits.isEmpty())
            return resList;
        
        int n = digits.length();
        backTrack(new StringBuilder(), n, 0, digits);
        return resList;
    }
    
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(StringBuilder sb, int n, int index, String digits){
        if(sb.length()==n){
            resList.add(sb.toString());
            return;
        }
        
        
        for(char ch : digitsToLetters[digits.charAt(index)-'0'].toCharArray()){
            sb.append(ch);
            backTrack(sb, n, index+1, digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}