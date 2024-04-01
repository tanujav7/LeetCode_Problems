class Solution {
    List<String> resList;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        
        resList = new ArrayList<>();
        backTrack(digits, 0, new StringBuilder());
        return resList;
    }
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(String digits, int i, StringBuilder sb){
        if(i==digits.length()){
            resList.add(sb.toString());
            return;
        }
        
        for(char ch : digitsToLetters[digits.charAt(i)-'0'].toCharArray()){
            sb.append(ch);
            backTrack(digits, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}