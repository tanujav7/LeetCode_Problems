class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        int longestConsecutive = 0;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int length = 1;
                while(set.contains(currentNum+1)){
                    length++;
                    currentNum += 1;
                }
                
                longestConsecutive = Math.max(longestConsecutive, length);
            }
        }
        
        return longestConsecutive;
    }
}