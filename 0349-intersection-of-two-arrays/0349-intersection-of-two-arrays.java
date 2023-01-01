class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //For output
      HashSet <Integer> res = new HashSet<>();
        
       //For binary search atleast one array needs to be sorted
        Arrays.sort(nums1);
        
        for(int i=0; i<nums2.length; i++){
             if(binarySearch(nums1, nums1.length, nums2[i])==true)
                 res.add(nums2[i]);
        }
        
        
        int output[] = new int[res.size()];
        int j=0;
        //Copying the elements of Hashset to array using for each loop
        for(int k:res){
            output[j++] = k;
        }
        
        return output;
    }
    
    public boolean binarySearch(int arr[], int n, int Key){
         int start = 0;
         int end = n-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==Key)
                return true;
            
            else if(arr[mid]<Key)
                start = mid+1;
            
            else
                end = mid-1;
        }
        
        return false;
    }
}

