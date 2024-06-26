class Solution {
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        
        if(digits.length()==0)
            return list;
        
        backTrack(digits, sb, 0);
        return list;
    }
    
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(String digits, StringBuilder sb, int index){
        if(sb.length()==digits.length()){
            list.add(sb.toString());
            return;
        }
        
        
        for(char ch : digitsToLetters[digits.charAt(index)-'0'].toCharArray()){
            sb.append(ch);
            backTrack(digits, sb, index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}