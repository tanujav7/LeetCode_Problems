class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length == 0) return false;
        
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int low = 0;
        int high = row*col;
        
        while(low<high){
             int mid = low+(high-low)/2;
            
            if(matrix[mid/col][mid%col]==target)
                return true;
            
            else if(matrix[mid/col][mid%col]>target)
                high = mid;
            
            else
                low = mid+1;
        
        }
        return false;
    }
}