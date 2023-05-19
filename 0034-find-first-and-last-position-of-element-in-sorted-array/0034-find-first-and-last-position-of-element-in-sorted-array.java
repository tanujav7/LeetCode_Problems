class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[] = {-1,-1};
        
     /*   if(nums.length==1 && nums[0]==1 && target==1)
            return new int[] {0,0};
        
        if(nums.length==1 && nums[0]==1 && target==0)
            return new int[] {-1,-1};
        */
        res[0] = findFirstOccurence(nums,target);
        res[1] = findLastOccurence(nums,target);
        
        return res;
    }
    
    int findFirstOccurence(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        int n = arr.length;
        int res = -1;
        
        while(left<=right){

            int mid = left+(right-left)/2;
            
            if(arr[mid]==target){
                res = mid;
                right = mid-1;
            }
            
            else if(arr[mid]<target)
                left = mid+1;
            
            else
                right = mid-1;
            
        }
        
        return res;
        
    }
    
    int findLastOccurence(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        int n = arr.length;
        int res = -1;
        
        
        while(left<=right){

            int mid = left+(right-left)/2;
        
            if(arr[mid]==target){
                res = mid;
                left = mid+1;
            }
            
            else if(arr[mid]<target)
                left = mid+1;
            
            else
                right = mid-1;
            
        }
        
        return res;
        
    }
}