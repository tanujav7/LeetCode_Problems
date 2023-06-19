class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums)
            set.add(i);
        
        int longestStreak = 0;
        
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
            int currentNum = nums[i];
            int currentStreak = 1;
            
            while(set.contains(currentNum+1)){
                currentNum++;
                currentStreak++;
            }
            
            longestStreak = Math.max(longestStreak, currentStreak);
        }
      }
        
        return longestStreak;
    }
}