class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        return Arrays.asList(getDifference(nums1, nums2), getDifference(nums2, nums1));
    }
    
    List<Integer> getDifference(int nums1[], int nums2[]){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int n2 : nums2)
            set2.add(n2);
        
        for(int i=0; i<nums1.length; i++){
            if(!set2.contains(nums1[i]))
                set1.add(nums1[i]);
        }
        
        return new ArrayList<>(set1);
    }
}