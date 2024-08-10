class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        Set<Integer> set = new HashSet<>();
        
        
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        
        int longestSequence = 0;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int num = nums[i];
                int sequenceLength = 1;
                while(set.contains(num+1)){
                    num = num+1;
                    sequenceLength++;
                }
                
                longestSequence = Math.max(longestSequence, sequenceLength);
            }
        }
        
        
        return longestSequence;
    }
}