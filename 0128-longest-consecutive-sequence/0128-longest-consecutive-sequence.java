class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums)
            set.add(num);
        
        int longestLen = 0;
        
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int currentLen = 1;
                while(set.contains(currentNum+1)){
                    currentNum = currentNum + 1;
                    currentLen++;
                }
                longestLen = Math.max(longestLen, currentLen);
            }
        }
        
        return longestLen;
    }
}