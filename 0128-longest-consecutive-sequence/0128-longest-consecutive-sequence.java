class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums)
            set.add(num);
        
        int longestConsecutive = 1;
        
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int consecutiveLen = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum = currentNum+1;
                    consecutiveLen++;
                }
                
                longestConsecutive = Math.max(longestConsecutive, consecutiveLen);
            }
        }
        
        return longestConsecutive;
    }
}