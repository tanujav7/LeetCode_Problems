class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int getRow = findRow(matrix, target);
        
        if(getRow==-1)
            return false;
        
        int low = 0;
        int high = matrix[0].length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(matrix[getRow][mid]==target)
                return true;
            
            else if(matrix[getRow][mid] < target)
                low = mid + 1;
            
            else
                high = mid - 1;
        }
        
        return false;
    }
    
    int findRow(int matrix[][], int target){
        int low = 0;
        int high = matrix.length-1;
        
        int lastCol = matrix[0].length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(matrix[mid][0]<=target && matrix[mid][lastCol]>=target)
                return mid;
            
            else if(matrix[mid][0]<target)
                low = mid + 1;
            
            else
                high = mid-1;
        }
        
        return -1;
    }
}