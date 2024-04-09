class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> resList = new ArrayList<>();
        
        int n = nums.length;
        
        //resList.add(nums[0]+"");
        
        for(int i=0; i<n; i++){
            int start = nums[i];
            
            while(i+1<n && nums[i]+1==nums[i+1]){
                i++;
            }
            
            int end = nums[i];
            
            if(start==end)
                resList.add(start+"");
            
            else
                resList.add(start+"->"+end);
        }
        
        return resList;
    }
}