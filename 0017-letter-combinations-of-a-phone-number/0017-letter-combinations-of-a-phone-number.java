class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        
        
        int n = digits.length();
        
        if(n==0)
            return res;
        StringBuilder sb = new StringBuilder();
        backTrack(digits, n, 0, sb);
        return res;
        
    }
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(String digits, int n, int i, StringBuilder sb){
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        
        for(char ch : digitsToLetters[digits.charAt(i) - '0'].toCharArray()){
            sb.append(ch);
            backTrack(digits, n, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}