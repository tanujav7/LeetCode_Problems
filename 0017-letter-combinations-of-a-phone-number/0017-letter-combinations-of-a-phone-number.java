class Solution {
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        int n = digits.length();
        
        if(n==0)
            return list;
        
        backTrack(digits, sb, 0, n);
        return list;
    }
    
    String digitsToLetters[] = {"", "", "abc", "def", "ghi", "jkl" ,"mno", "pqrs", "tuv", "wxyz"};
    
    void backTrack(String digits, StringBuilder sb, int index, int n){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        
        for(char ch : digitsToLetters[digits.charAt(index)-'0'].toCharArray()){
            sb.append(ch);
            backTrack(digits, sb, index+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}