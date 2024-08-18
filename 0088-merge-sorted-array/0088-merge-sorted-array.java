class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        m = m-1;
        n = n-1;
        
        
        int len = nums1.length-1;
        
        
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n])
                nums1[len--] = nums1[m--];
            else
                nums1[len--] = nums2[n--];
        }
        
        
         while(m>=0){
            nums1[len--] = nums1[m--];
        }
        
        
         while(n>=0){
             nums1[len--] = nums2[n--];
        }
    }
}