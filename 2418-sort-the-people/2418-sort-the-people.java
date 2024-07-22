class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int numberOfPeople = heights.length;
        
        Map<Integer, String> map = new HashMap<>();
        
        for(int i=0; i<numberOfPeople; i++){
            map.put(heights[i], names[i]);
        }
        
        
        Arrays.sort(heights);
        
        
        String res[] = new String[numberOfPeople];
        
        for(int i=numberOfPeople-1; i>=0; --i){
            res[numberOfPeople-i-1] = map.get(heights[i]);
        }
       
        return res;
    }
}