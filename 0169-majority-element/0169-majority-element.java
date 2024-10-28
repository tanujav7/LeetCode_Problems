class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        int n = nums.length;
        
        int val = (n/2) + 1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            
            if(value>=val){
                return key;
            }
        }
        
        return -1;
    }
}