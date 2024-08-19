class Solution {
    public int maxArea(int[] height) {
    
        int n = height.length;
        
        int i = 0, j = n-1;
    
        int res = 0;
        
      while(i<j){
          int diff_index = j-i;
          int minheight = Math.min(height[i], height[j]);
          
          
          if(height[i]<height[j])
              i++;
          else
              j--;
          
          res = Math.max(diff_index*minheight, res);
      }
        
        return res;
    }
}