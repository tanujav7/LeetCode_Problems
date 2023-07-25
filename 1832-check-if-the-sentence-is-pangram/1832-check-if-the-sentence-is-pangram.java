class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> set = new HashSet<>();
        
        for(char letter : sentence.toCharArray()){
            set.add(letter);
        }
        
        
        return (set.size()==26);
    }
}