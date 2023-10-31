class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        return Arrays.asList(getDifference(nums2, nums1), getDifference(nums1, nums2));
        
    }
    
    List<Integer> getDifference(int nums1[], int nums2[]){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums1)
            set1.add(n);
        
        for(int i=0; i<nums2.length; i++){
            if(!set1.contains(nums2[i]))
                set2.add(nums2[i]);
        }
        
        
        return new ArrayList<>(set2);
    }
}