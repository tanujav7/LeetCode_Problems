class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int num = nums[i];
            
            while(i+1<n && nums[i+1]==nums[i]+1)
                i++;
            
            if(num!=nums[i])
                list.add(num+"->"+nums[i]);
            
            else
                list.add(""+num);
        }
        
        return list;
    }
}