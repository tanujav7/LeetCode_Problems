class Solution {
    List<String> resList;
    public List<String> letterCombinations(String digits) {
        resList = new ArrayList<>();
        
        if(digits.isEmpty())
            return resList;
        
        backTrack(new StringBuilder(), digits.length(), 0, digits);
        return resList;
    }
    
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(StringBuilder sb, int n, int ind, String digits){
        if(sb.length()==n){
            resList.add(sb.toString());
            return;
        }
        
        for(char ch : digitsToLetters[digits.charAt(ind)-'0'].toCharArray()){
            sb.append(ch);
            backTrack(sb, n, ind+1, digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}