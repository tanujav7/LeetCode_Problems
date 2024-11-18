class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getDifference(nums1, nums2), getDifference(nums2, nums1));
    }
    
    List<Integer> getDifference(int nums1[], int nums2[]){
        Set<Integer> set = new HashSet<>();
        
        Set<Integer> res = new HashSet<>();
        
        for(int num : nums2){
            set.add(num);
        }
        
        for(int i=0; i<nums1.length; i++){
            if(!set.contains(nums1[i]))
                res.add(nums1[i]);
        }
        
        return new ArrayList<>(res);
    }
}