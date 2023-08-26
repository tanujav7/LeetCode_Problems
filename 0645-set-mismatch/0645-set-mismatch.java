class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int duplicate = 0, missing = 0;
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        for(int i=1; i<=n; i++){
            if(map.containsKey(i)){
                if(map.get(i)==2)
                    duplicate = i;
                
            }
            else
                missing = i;
            
        }
        
        return new int[]{duplicate, missing};
    }
}