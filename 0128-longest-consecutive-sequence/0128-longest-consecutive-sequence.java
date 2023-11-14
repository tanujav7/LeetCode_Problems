class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums)
            set.add(num);
        
        int n = nums.length;
        int longestConsecutive = 0;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int currentLength = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }
                
                longestConsecutive = Math.max(longestConsecutive, currentLength);
            }
        }
        
        return longestConsecutive;
    }
}