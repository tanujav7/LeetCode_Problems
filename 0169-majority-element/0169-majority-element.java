class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            
            if(val>(n/2))
                return key;
        }
        
        return -1;
    }
}