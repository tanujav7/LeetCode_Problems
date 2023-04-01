class Solution {
    public int longestConsecutive(int[] nums) {
        
  Set<Integer> set = new HashSet<>();
        
    for(int i=0; i<nums.length; i++)
        set.add(nums[i]);
       
        int longestConsecutive = 0;
        
   for(int i=0; i<nums.length; i++){
      
      if(!set.contains(nums[i]-1)){
            
          int currentNum = nums[i];
          int currentStreak = 1;
      
          while(set.contains(currentNum+1)){
    
              currentNum+=1;
              currentStreak+=1;
          
          }
      
          longestConsecutive = Math.max(longestConsecutive,currentStreak);
      
      }
      
  }
        
        return longestConsecutive;
    }
}