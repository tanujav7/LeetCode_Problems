class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        int n = nums.length;
        
        if(n==0)
            return 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        int maxLen = 1;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int currentLen = 1;
                
                while(set.contains(currentNum+1)){
                    currentLen++;
                    currentNum = currentNum+1;
                }
                
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        
        return maxLen;
    }
}