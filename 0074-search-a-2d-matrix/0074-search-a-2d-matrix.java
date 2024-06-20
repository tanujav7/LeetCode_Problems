class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        
        int col = matrix[0].length;
        
        int low = 0, high = row-1;
        
        int targetRow = 0;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(matrix[mid][0]<=target && matrix[mid][col-1]>=target){
                 targetRow = mid;
                 break;
            }
               
            
            else if(matrix[mid][0]<target)
                low = mid+1;
            
            else
                high = mid-1;
                
        }
        
        
        low = 0;
        high = col-1;
        
         while(low<=high){
            int mid = low + (high-low)/2;
            
            if(matrix[targetRow][mid]==target)
                return true;
            
            else if(matrix[targetRow][mid]<target)
                low = mid+1;
            
            else
                high = mid-1;
                
        }
        
        return false;
        
    }
}