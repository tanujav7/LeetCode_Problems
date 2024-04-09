class Solution {
    public int maxArea(int[] height) {
        
        
        int n = height.length;
        
        int i = 0, j = n-1;
        
        int width = 0, val = 0, res = 0;
        
        while(i<j){
            if(height[i]<=height[j]){
                width = Math.abs(i-j);
                val = height[i];
                res = Math.max(res, width*val);
                i++;
            }
            
            else{
                 width = Math.abs(i-j);
                 val = height[j];
                 res = Math.max(res, width*val);
                 j--;
            }
            
        }
        
        return res;
    }
}