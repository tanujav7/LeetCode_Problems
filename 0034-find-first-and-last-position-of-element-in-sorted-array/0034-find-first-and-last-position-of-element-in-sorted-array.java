class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);
        
        return new int[]{first, last};
    }
    
    int firstOccurrence(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]==target){
                res = mid;
                high = mid-1;
            }
            
            else if(arr[mid]<target)
                low = mid+1;
            
            else
                high = mid-1;
        }
        
        return res;
    }
    
     int lastOccurrence(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]==target){
                res = mid;
                low = mid+1;
            }
            
            else if(arr[mid]<target)
                low = mid+1;
            
            else
                high = mid-1;
        }
        
        return res;
    }
}