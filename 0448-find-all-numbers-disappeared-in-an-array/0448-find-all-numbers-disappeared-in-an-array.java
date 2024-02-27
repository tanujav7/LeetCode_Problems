class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        
        for(int i=1; i<=n; i++){
            if(!set.contains(i))
                list.add(i);
        }
        
        return list;
    }
}