class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[] = {-1,-1};
        
         res[0] = firstOcurrence(nums,target);
         res[1] = lastOcurrence(nums,target);
        
        return res;
    }
    
    int firstOcurrence(int arr[], int target){
        
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
    
    
    int lastOcurrence(int arr[], int target){
        
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