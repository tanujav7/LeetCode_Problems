class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
                list.add(Math.abs(nums[i]));
            else
                nums[index] = -1 * Math.abs(nums[index]);
        }
        
       return list;
    }
}