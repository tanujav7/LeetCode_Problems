class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int res = 0;
        
        while(left<right){
            int width = right - left;
            
            int min = Math.min(height[left], height[right]);
             res = Math.max(res,width*min);
            
            if(height[left]<height[right])
                left++;
            
            else
                right--;
        }
        
        return res;
    }
}