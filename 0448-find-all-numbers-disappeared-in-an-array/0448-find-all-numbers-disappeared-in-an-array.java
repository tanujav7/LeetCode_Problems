class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int index = Math.abs(nums[i])-1;
            nums[index] = -1 * Math.abs(nums[index]);
        }
        
        
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                list.add(i+1);
        }
        
        
        return list;
    }
}