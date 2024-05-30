class Solution {
    List<String> res;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        int n = digits.length();
        
        if(n==0)
            return res;
        
        StringBuilder sb = new StringBuilder();
        
        backTrack(digits, sb, 0, n);
        
        return res;
    }
    
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(String digits, StringBuilder sb, int i, int n){
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        
        for(char ch : digitsToLetters[digits.charAt(i)-'0'].toCharArray()){
            sb.append(ch);
            backTrack(digits, sb, i+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}