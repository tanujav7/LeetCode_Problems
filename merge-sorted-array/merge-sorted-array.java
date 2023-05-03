class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    // Two pointer pointing at the last elements of the 2 Array
        m = m-1;
        n = n-1;
        
        //Accessing the last index of nums1
        int index = nums1.length-1;
        
        // We fill the array from the last index of nums1
        
        while(m>=0 && n>=0){
            
            if(nums1[m]>nums2[n]){
                nums1[index--] = nums1[m--];
            }
            
            else{
                nums1[index--] = nums2[n--];
            }
        }
        
        // If any one of the element is remaining in any one of the array, we simply copy it to answer array(nums1).
        while(m>=0)
            nums1[index--] = nums1[m--];
        
         while(n>=0)
            nums1[index--] = nums2[n--];
        
        
    }
}