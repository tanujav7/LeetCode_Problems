class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        int n = nums.length;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            
            if(val>(n/2))
                return key;
        }
        
        return 0;
    }
}