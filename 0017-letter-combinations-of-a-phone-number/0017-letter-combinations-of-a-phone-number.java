class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        
        List<String> list = new ArrayList<>();
        
        dfs(digits, 0, new StringBuilder(), list);
        
        return list;
    }
    
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void dfs(String digits, int i, StringBuilder sb, List<String> list){
        if(i==digits.length()){
            list.add(sb.toString());
            return;
        }
        
        for(char ch : digitsToLetters[digits.charAt(i)-'0'].toCharArray()){
            sb.append(ch);
            dfs(digits, i+1, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}