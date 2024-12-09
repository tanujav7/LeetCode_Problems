class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();
        
        for(char ch:sentence.toCharArray()){
            seen.add(ch);
        }
        
        return seen.size()==26;
    }
}