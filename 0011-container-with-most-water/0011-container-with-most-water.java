class Solution {
    public int maxArea(int[] height) {
        
        int i = 0, j = height.length-1;
        
        int res = 0;
        
        while(i<j){
            int maxHeight = Math.min(height[i], height[j]);
            int diff = j-i;
            res = Math.max(res, maxHeight*diff);
            
            if(height[i]>=height[j])
                j--;
            else if(height[j]>height[i])
                i++;
        }
        
        return res;
    }
}