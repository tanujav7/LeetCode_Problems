class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Arrays.sort(nums1);
        
        for(int i=0; i<n2; i++){
            if(binarySearch(nums1,n1,nums2[i])==true)
                set.add(nums2[i]);
        }
        
        int output[] = new int[set.size()];
        int i=0;
        
        for(int j:set)
            output[i++] = j;
        
        return output;
    }
    
    boolean binarySearch(int nums[], int n, int key){
        int left = 0;
        int right = n-1;
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            if(nums[mid]==key)
                return true;
            
            else if(nums[mid]<key)
                left = mid+1;
            
            else
                right = mid-1;
        }
        
        return false;
    }
}