class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        
        int n = nums.length;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        
        int resLen = 1;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int currNum = nums[i];
                int currentLen = 1;
                while(set.contains(currNum+1)){
                    currNum = currNum + 1;
                    currentLen++;
                }
                resLen = Math.max(resLen, currentLen);
            }
        }
        
        return resLen;
    }
}