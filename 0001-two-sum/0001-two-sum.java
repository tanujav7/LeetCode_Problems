class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         int n = nums.length;
        
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[] {i, j};
//                 }
//             }
//         }
        
//         return null;
        
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int diff = target-nums[i];
            
            if(map.containsKey(diff))
                return new int[] {map.get(diff), i};
            else
                map.put(nums[i], i);
        }
        
        return null;
    }
}