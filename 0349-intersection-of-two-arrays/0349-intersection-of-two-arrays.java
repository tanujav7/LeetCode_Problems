class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> res = new HashSet<>();
        Arrays.sort(nums1);
        
        for(int i=0; i<nums2.length; i++){
            if(binarySearch(nums1,nums1.length,nums2[i]))
                res.add(nums2[i]);
        }
        
        int output[] = new int[res.size()];
        int index = 0;
        for(int i : res)
            output[index++] = i;
        
        return output;
    }
    
    boolean binarySearch(int arr[], int n, int target){
        
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]==target)
                return true;
            
            else if(arr[mid]<target)
                low++;
            
            else
                high--;
            
        }
        
        return false;
    }
}