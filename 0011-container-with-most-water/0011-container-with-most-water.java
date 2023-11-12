class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int left = 0, right = n-1;
        int res = Integer.MIN_VALUE;
        
        while(left<right){
            int minHeight = Math.min(height[left], height[right]);
            res = Math.max(res, minHeight * (Math.abs(left-right)));
            
            if(height[left]<height[right])
                left++;
            
            else
                right--;
        }
        
        return res;
    }
}