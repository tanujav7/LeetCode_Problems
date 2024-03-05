class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int num = Math.abs(nums[i])-1;
            
            if(nums[num]>0)
                nums[num] = -1 * nums[num];
        }
        
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                list.add(i+1);
        }
        
        
        return list;
        
    }
}