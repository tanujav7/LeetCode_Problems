class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i]))
                res.add(nums2[i]);
        }
        
        int resArr[] = new int[res.size()];
        
        int j=0;
        
        for(int k:res){
            resArr[j++] = k;
        }
        
        
        return resArr;
    }
}