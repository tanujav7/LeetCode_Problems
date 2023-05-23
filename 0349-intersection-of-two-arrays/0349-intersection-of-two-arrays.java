class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> intersection = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j])
                    intersection.add(nums1[i]);
            }
        }
        
       int res[] = new int[intersection.size()];
        
        int k = 0;
        
        for(int i:intersection)
            res[k++] = i;
        
        return res;
    }
}