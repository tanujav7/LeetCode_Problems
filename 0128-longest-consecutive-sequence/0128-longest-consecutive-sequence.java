class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums)
            set.add(i);
        
        int longestConsecutive = 0;
        
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int consecutiveLength = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    consecutiveLength++;
                }
                longestConsecutive = Math.max(consecutiveLength,longestConsecutive);
            }
        }
        
        return longestConsecutive;
    }
}