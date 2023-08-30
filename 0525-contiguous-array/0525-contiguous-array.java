class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        int maxLength = 0;
        
        map.put(0, -1);
        
        for(int i=0; i<nums.length; i++){
            count += (nums[i]==0) ? 1 : -1;
            
            if(map.containsKey(count)){
                maxLength = Math.max(maxLength, i-map.get(count));
            }
            
            else{
                map.put(count, i);
            }
            
        }
        
        
        return maxLength;
    }
}