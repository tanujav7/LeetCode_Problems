class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        int n = nums.length;
        
        for(int num:nums){
            set.add(num);
        }
        
        int longestConsecutive = 0;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int len = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    len++;
                }
               longestConsecutive = Math.max(longestConsecutive, len); 
            }
        }
        
        return longestConsecutive;
    }
}