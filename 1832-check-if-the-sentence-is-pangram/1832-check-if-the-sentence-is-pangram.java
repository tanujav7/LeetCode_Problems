class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> set = new HashSet<>();
        
        for(char currentChar:sentence.toCharArray()){
            set.add(currentChar);
        }
        
        return set.size()==26;
    }
}