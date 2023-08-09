class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        
        int res[] = new int[n];
        
        int m = nums2.length;
        
        for(int i=0; i<n; i++){
            boolean found = false;
            boolean flag = false;
            for(int j=0; j<m; j++){
                if(nums1[i]==nums2[j])
                    found = true;
                if(found==true && nums2[j]>nums1[i]){
                    res[i] = nums2[j];
                    flag = true;
                    break;
                }
            }
            if(flag==false)
            res[i] = -1;
        }
        
        return res;
    }
}