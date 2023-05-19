class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int res[] = new int[m+n];
        
        int k = 0;
        int i=0, j=0;
        
        while(i<m && j<n){
            if(nums1[i]<nums2[j])
                res[k++] = nums1[i++];
            
            else
                res[k++] = nums2[j++];
        }
        
        while(i<m)
             res[k++] = nums1[i++];
        
        while(j<n)
             res[k++] = nums2[j++];
        
        
      if(k%2==1)
          return (double)(res[k/2]);
        
      else
          return (double)(res[k/2]+(double)res[(k/2)-1])/2;
    }
}