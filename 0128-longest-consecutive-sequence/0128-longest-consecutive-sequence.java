class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        
        int n = nums.length;
        
        if(n==0)
            return 0;
        
        int maxLen = 1;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int currentLen = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum = currentNum + 1;
                    currentLen++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        
        return maxLen;
    }
}