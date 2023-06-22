class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        Set<Integer> set = new HashSet<Integer>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                list.add(nums[i]);
        }
        
        return list;
    }
}