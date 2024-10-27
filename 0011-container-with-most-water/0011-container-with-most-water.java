class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        
        int n = height.length;
        
        int i = 0, j = n-1;
        
        int area = 0;
        
        while(i<j){
             int diff = j-i;
            if(height[i]<=height[j]){
                area = height[i] * diff;
                i++;
            }
            else{
                area = height[j] * diff;
                j--;
            }
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}